public class MyArrayList{
    int size = 0;
    Object[] collection = new Object[5];

    public void add(Object e){
        collection[size] = e;
        size++;

        if (size == collection.length){
            Object[] newCollection = new Object[collection.length*2];

            for (int i=0; i<collection.length; i++){
                newCollection[i] = collection[i];
            }

            collection = newCollection;
        }
    }

    public int getIndex(Object targetElement){
        for (int i = 0; i < collection.length; i++){
            if (collection[i] == targetElement){
                return i;
            }
        }
        return -1;  // Нету значит
    }

    public void remove(int index){
        for (int i=index; i<size-1; i++){
            collection[i] = collection[i+1];
        }
        size--;

        collection[size] = null;
    }

    public void merge(MyArrayList otherList){
        for (int i = 0; i < otherList.size; i++) {
            add(otherList.collection[i]);
        }
    }

    public boolean contains(Object targetObject){
        for (int i=0; i<size; i++){
            if (targetObject == collection[i]){
                return true;
            }
        }
        return false;
    }

    public void removeDuplicates(){
        MyArrayList uniqueCollection = new MyArrayList();

        for (int i=0; i<size; i++){
            if (!uniqueCollection.contains(collection[i])){
                uniqueCollection.add(collection[i]);
            }
        }

        collection = uniqueCollection.collection;
    }
}
