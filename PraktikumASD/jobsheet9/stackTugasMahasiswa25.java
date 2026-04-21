package PraktikumASD.jobsheet9;

public class stackTugasMahasiswa25 {
    
    mahasiswa25[] stack;
    int top;
    int size;

    public stackTugasMahasiswa25(int size) {
        this.size = size;
        stack = new mahasiswa25[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(mahasiswa25 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh! Tidak bisa menambah tugas lagi.");
        }
    }

    public mahasiswa25 pop() {
        if (!isEmpty()) {
            mahasiswa25 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! tidak ada tugas untuk dinilai");
            return null;
        }
    }

    public mahasiswa25 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! tidak ada tugas yang dikumpulan");
            return null;
        }
    }

    public void print() {
        for (int i = top; i > -1; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public mahasiswa25 peekTerbawah() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! tidak ada tugas yang dikumpulkan");
            return null;
        }
    }

    public int hitungTugas() {
        if (isEmpty()) {
            return 0;
        } else {
            return top + 1;
        }
    }

    public String konversiDesimalKeBiner(int nilai) {
        stackKonversi25 stack = new stackKonversi25();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
