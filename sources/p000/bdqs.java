package p000;

import com.felicanetworks.sdu.ErrorInfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: bdqs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdqs implements bdqj {

    /* renamed from: a */
    private static final bnrt f106277a = bnrt.m110178a("bdqs");

    /* renamed from: b */
    private final File f106278b;

    /* renamed from: c */
    private boolean f106279c;

    /* renamed from: d */
    private bdqr f106280d;

    public bdqs(File file) {
        this.f106278b = file;
        boolean z = true;
        if (file == null) {
            bnrq bnrq = (bnrq) f106277a.mo68387b();
            bnrq.mo68432a("bdqs", "a", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("Transmitter initialized with invalid path");
            z = false;
        } else if (!file.exists()) {
            if (!this.f106278b.getParentFile().exists() || !this.f106278b.getParentFile().canWrite()) {
                z = this.f106278b.getParentFile().mkdirs();
            }
        } else if (!this.f106278b.canWrite()) {
            bnrq bnrq2 = (bnrq) f106277a.mo68387b();
            bnrq2.mo68432a("bdqs", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq2.mo68420a("File %s is not writable", this.f106278b);
            z = false;
        }
        this.f106279c = z;
    }

    /* renamed from: a */
    private final boolean m91308a() {
        File file = this.f106278b;
        if (file == null) {
            bnrq bnrq = (bnrq) f106277a.mo68387b();
            bnrq.mo68432a("bdqs", "a", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("Transmitter initialized with invalid path");
            return false;
        } else if (!file.exists()) {
            if (!this.f106278b.getParentFile().exists() || !this.f106278b.getParentFile().canWrite()) {
                return this.f106278b.getParentFile().mkdirs();
            }
            return true;
        } else if (this.f106278b.canWrite()) {
            return true;
        } else {
            bnrq bnrq2 = (bnrq) f106277a.mo68387b();
            bnrq2.mo68432a("bdqs", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq2.mo68420a("File %s is not writable", this.f106278b);
            return false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* renamed from: b */
    private final void m91309b() {
        try {
            this.f106280d = new bdqr(new FileOutputStream(this.f106278b, true));
        } catch (IOException e) {
            bnrq bnrq = (bnrq) f106277a.mo68387b();
            bnrq.mo68437a(e);
            bnrq.mo68432a("bdqs", "b", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("An error occurred while creating output stream.");
            this.f106279c = false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException}
     arg types: [java.io.File, int]
     candidates:
      ClspMth{java.io.FileOutputStream.<init>(java.lang.String, boolean):void throws java.io.FileNotFoundException}
      ClspMth{java.io.FileOutputStream.<init>(java.io.File, boolean):void throws java.io.FileNotFoundException} */
    /* renamed from: b */
    private final synchronized void m91310b(cios cios) {
        if (this.f106280d == null) {
            try {
                this.f106280d = new bdqr(new FileOutputStream(this.f106278b, true));
            } catch (IOException e) {
                bnrq bnrq = (bnrq) f106277a.mo68387b();
                bnrq.mo68437a(e);
                bnrq.mo68432a("bdqs", "b", (int) ErrorInfo.TYPE_SDU_FAILED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("An error occurred while creating output stream.");
                this.f106279c = false;
            }
        }
        try {
            bdqr bdqr = this.f106280d;
            byte[] k = cios.serializeToBytes();
            synchronized (bdqr.f106276a) {
                bdqr.f106276a.mo73867c(k);
                bdqr.f106276a.mo73851c();
            }
        } catch (IOException e2) {
            bnrq bnrq2 = (bnrq) f106277a.mo68387b();
            bnrq2.mo68437a(e2);
            bnrq2.mo68432a("bdqs", "b", 121, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq2.mo68405a("An error occurred while dumping data.");
            this.f106279c = false;
            return;
        }
        return;
    }

    /* renamed from: a */
    public final void mo58298a(cios cios) {
        if (!this.f106279c) {
            bnrq bnrq = (bnrq) f106277a.mo68388c();
            bnrq.mo68432a("bdqs", "a", 67, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnrq.mo68405a("Skip logging metric as transmitter not initialized properly");
            return;
        }
        m91310b(cios);
    }
}
