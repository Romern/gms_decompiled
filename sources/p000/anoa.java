package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: anoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anoa implements rjz, rka, anup {

    /* renamed from: a */
    private static anoa f77258a;

    /* renamed from: b */
    private final Context f77259b;

    /* renamed from: c */
    private final HashMap f77260c = new HashMap();

    /* renamed from: d */
    private final LinkedList f77261d;

    /* renamed from: e */
    private final anul f77262e;

    /* renamed from: f */
    private anuy f77263f;

    private anoa(Context context) {
        anul anul = anuy.f77749a;
        this.f77259b = context.getApplicationContext();
        this.f77261d = new LinkedList();
        this.f77262e = anul;
    }

    /* renamed from: a */
    public static anoa m64848a(Context context) {
        if (f77258a == null) {
            f77258a = new anoa(context);
        }
        return f77258a;
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        this.f77263f = null;
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        this.f77263f = null;
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        this.f77263f.mo42327b(this, ((Integer) ansx.f77703y.mo25081c()).intValue(), null);
    }

    /* renamed from: a */
    public final void mo42026a(annz annz) {
        anuy anuy;
        this.f77261d.remove(annz);
        if (this.f77261d.isEmpty() && (anuy = this.f77263f) != null) {
            if (anuy.mo24648p() || this.f77263f.mo24649q()) {
                this.f77263f.mo14032j();
            }
            this.f77263f = null;
        }
    }

    /* renamed from: a */
    public final void mo42027a(annz annz, String str, String str2) {
        anny anny = (anny) this.f77260c.get(str);
        if (anny == null) {
            if (!this.f77261d.contains(annz)) {
                this.f77261d.add(annz);
            }
            if (this.f77263f == null) {
                anuy a = anme.m64734a(this.f77262e, this.f77259b, this, this, str2);
                this.f77263f = a;
                a.mo42332x();
                return;
            }
            return;
        }
        annz.mo42020a(anny);
    }

    /* renamed from: a */
    public final void mo42028a(ConnectionResult connectionResult, anxm anxm, String str) {
        if (anxm != null && connectionResult.mo17671b()) {
            int a = anxm.mo24660a();
            for (int i = 0; i < a; i++) {
                anxl b = anxm.mo24661a(i);
                String c = b.mo42353c();
                if (this.f77260c.get(c) == null) {
                    this.f77260c.put(c, new anny(c, b.mo42351a(), b.mo42352b()));
                }
                anny anny = (anny) this.f77260c.get(b.mo42353c());
                int size = this.f77261d.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((annz) this.f77261d.get(i2)).mo42020a(anny);
                }
            }
            if (str != null) {
                this.f77263f.mo42327b(this, ((Integer) ansx.f77703y.mo25081c()).intValue(), str);
                return;
            }
            this.f77263f.mo14032j();
            this.f77263f = null;
            return;
        }
        this.f77263f.mo14032j();
        this.f77263f = null;
    }
}
