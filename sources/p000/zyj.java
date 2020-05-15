package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.fonts.FontFetchResult;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: zyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zyj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ zyk f56180a;

    /* renamed from: b */
    private final zxn f56181b;

    /* renamed from: c */
    private final zxv f56182c;

    public zyj(zyk zyk, zxn zxn, zxv zxv) {
        this.f56180a = zyk;
        this.f56181b = zxn;
        this.f56182c = zxv;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zxv.a(zxi, zxh, boolean):java.io.File
     arg types: [zxi, zxh, int]
     candidates:
      zxv.a(java.io.File, zxi, zxh):java.io.File
      zxv.a(long, java.io.File, java.io.File):boolean
      zxv.a(zxi, zxh, boolean):java.io.File */
    public final void run() {
        Status status;
        Throwable e;
        FontFetchResult a = FontFetchResult.m23827a(zyk.f56183a);
        String a2 = zxv.m46648a(this.f56180a.f56185c);
        try {
            status = (Status) this.f56181b.mo31558a(a2).get(this.f56180a.f56189g, TimeUnit.MILLISECONDS);
            try {
                if (!status.mo17710c()) {
                    zyh.m46683c("FontFetch", "Extracting asset failed with status: %s, for %s", Integer.valueOf(status.f30115i), a2);
                } else {
                    zxv zxv = this.f56182c;
                    zyu zyu = this.f56180a.f56186d;
                    File a3 = zxv.mo31570a(zyu.f56228b, zyu.f56229c, true);
                    if (a3 == null) {
                        zyh.m46683c("FontFetch", "Extracting asset succeeded but file not found on disk", new Object[0]);
                    } else {
                        zyu zyu2 = this.f56180a.f56186d;
                        a = FontFetchResult.m23828a(zyk.m46689a(zyu2.f56228b, zyu2.f56229c), a3);
                    }
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                e = e2;
                zyh.m46681a("FontFetch", e, "Error in extracting asset %s", a2);
                this.f56181b.mo31559b(zxv.m46648a(this.f56180a.f56185c));
                this.f56180a.mo31594a(a);
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e3) {
            e = e3;
            status = null;
            zyh.m46681a("FontFetch", e, "Error in extracting asset %s", a2);
            this.f56181b.mo31559b(zxv.m46648a(this.f56180a.f56185c));
            this.f56180a.mo31594a(a);
        }
        if (status == null || status.f30115i != 23509) {
            this.f56181b.mo31559b(zxv.m46648a(this.f56180a.f56185c));
        }
        this.f56180a.mo31594a(a);
    }
}
