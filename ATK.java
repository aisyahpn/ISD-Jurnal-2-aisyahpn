public class ATK implements Comparable<ATK>{
        String kode;
        String tipe;
        String nama;
        int stok;
    
        public ATK(String kode, String tipe, String nama, int stok) {
            this.kode = kode;
            this.tipe = tipe;
            this.nama = nama;
            this.stok = stok;
        }
    
        
        @Override
        public String toString() {
            return "Atk [kode: " + kode + ", tipe: " + tipe + ", nama: " + nama + ", stok: " + stok + "]";
        }
    
    
        public String getKode() {
            return kode;
        }
    
        public String getTipe() {
            return tipe;
        }
    
        public String getNama() {
            return nama;
        }
    
        public int getStok() {
            return stok;
        }
  
        public void setKode(String kode) {
            this.kode = kode;
        }

        public void setTipe(String tipe) {
            this.tipe = tipe;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }
    
        public void setStok(int stok) {
            this.stok = stok;
        }
    
        @Override
        public int compareTo(ATK o) {
            return this.getKode().compareTo(o.getKode());
        }   
    }

