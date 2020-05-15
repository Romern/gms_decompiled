package p000;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: nzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nzt {

    /* renamed from: a */
    public static final bnsn f37018a = odk.m28481a("CAR.DIAGNOSTICS");

    /* renamed from: b */
    public final Object f37019b = new Object();

    /* renamed from: c */
    public final Callable f37020c;

    /* renamed from: d */
    public List f37021d;

    /* renamed from: e */
    private final ExecutorService f37022e;

    public nzt(Callable callable) {
        ExecutorService b = adzl.f62962b.mo25879b(2);
        this.f37020c = callable;
        this.f37022e = b;
    }

    /* renamed from: a */
    public final void mo21876a(File file) {
        List list;
        ParcelFileDescriptor parcelFileDescriptor;
        synchronized (this.f37019b) {
            list = this.f37021d;
            this.f37021d = null;
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
                    bnsi c = f37018a.mo68388c();
                    c.mo68432a("nzt", "a", 139, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    c.mo68405a("Error closing fd");
                }
            }
        }
        if (file != null) {
            file.delete();
        }
    }

    /* renamed from: a */
    public final void mo21877a(nzw nzw) {
        synchronized (this.f37019b) {
            if (this.f37021d == null) {
                this.f37022e.execute(new nzs(this));
                this.f37021d = new ArrayList();
            }
            this.f37021d.add(nzw);
        }
    }
}
