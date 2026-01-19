import java.util.Scanner;
public class Fernando_2368_Manajemenkeuanganharian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner masuk = new Scanner(System.in);
		String[] kategori = new String[20];
		double[] jumlah = new double[20];
		int jumlahTransaksi = 0;
		double saldo = 0;
		
		boolean lanjut = true;
		while (lanjut) {
			System.out.println("Manajemen Keuangan Harian");
			System.out.println("1. Tambah pemasukan");
			System.out.println("2. Tambah pengeluaran");
			System.out.println("3. Cek saldo");
			System.out.println("4. Riwayat transaksi");
			System.out.println("5. done/selesai");
		int pilihan = masuk.nextInt();
		
		switch (pilihan) {
		case 1:
			System.out.print("Masukkan kategori pemasukan : ");
			String katPemasukan = masuk.next();
			System.out.print("Masukkan jumlah pemasukan : ");
			double jumPemasukan = masuk.nextDouble();
			kategori[jumlahTransaksi] = katPemasukan;
			jumlah[jumlahTransaksi] = jumPemasukan;
			saldo += jumPemasukan;
			jumlahTransaksi++;
			System.out.println("Pemasukan berhasil ditambahkan");
			break;
			
		case 2:
			System.out.print("Masukkan kategori pengeluaran : ");
			String katPengeluaran = masuk.next();
			System.out.print("Maasukkan jumlah pengeluaran : ");
			double jumPengeluaran = masuk.nextDouble();
			kategori[jumlahTransaksi] = katPengeluaran;
			jumlah[jumlahTransaksi] = -jumPengeluaran;
			saldo -= jumPengeluaran;
			jumlahTransaksi++;
			System.out.println("Pengeluaran berhasil ditambahkan");
			break;
			
		case 3:
			System.out.println("Saldo anda: Rp"+saldo);
			if (saldo > 100000) {
				System.out.println("saldo anda aman, coba tabung atau mulai investasi kecil");
			}
			else if (saldo >= 0) {
				System.out.println("saldo anda cukup aman, coba lebih hemat lagi!");
			}
			else {
				System.out.println("saldo anda negatif, cobalah cari pemasukan tambahan!!");
			}
			break;
			
		case 4:
			System.out.println("Riwayat Transaksi : ");
			for (int i = 0; i < jumlahTransaksi; i++) {
				System.out.println((i+1) + ". "+kategori[i] + ": Rp"+jumlah[i]);
			}
			if (jumlahTransaksi == 0) {
				System.out.println("Belum ada transaksi");
			}
			break;
		
		case 5:
			lanjut = false;
			System.out.println("Terima kasih telah menggunakan program");
			break;
			
		default:
			System.out.println("Pilihan tidak valid");
		}
		}

	}

}
