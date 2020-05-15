package p000;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/* renamed from: nzs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nzs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ nzt f37017a;

    public nzs(nzt nzt) {
        this.f37017a = nzt;
    }

    public final void run() {
        File file;
        List list;
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            nzt nzt = this.f37017a;
            bnsn bnsn = nzt.f37018a;
            file = (File) nzt.f37020c.call();
            if (file != null) {
                nzt nzt2 = this.f37017a;
                synchronized (nzt2.f37019b) {
                    list = nzt2.f37021d;
                    nzt2.f37021d = null;
                }
                bmxy.m108581a(list);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    nzw nzw = (nzw) list.get(i);
                    if (file != null) {
                        try {
                            parcelFileDescriptor = ParcelFileDescriptor.open(file, 268435456);
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        } catch (RemoteException e2) {
                        }
                    } else {
                        parcelFileDescriptor = null;
                    }
                    nzw.mo21878a(parcelFileDescriptor);
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e3) {
                            bnsi c = nzt.f37018a.mo68388c();
                            c.mo68432a("nzt", "a", 139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                            c.mo68405a("Error closing fd");
                        }
                    }
                }
                if (file != null) {
                    file.delete();
                    return;
                }
                return;
            }
            synchronized (this.f37017a.f37019b) {
                this.f37017a.f37021d = null;
            }
        } catch (Exception e4) {
            bnsi c2 = nzt.f37018a.mo68388c();
            c2.mo68437a(e4);
            c2.mo68432a("nzs", "run", 109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68405a("Couldn't fetch data.");
            file = null;
        }
    }
}
