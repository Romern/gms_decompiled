package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.chimera.Loader;
import com.google.android.gms.smart_profile.SmartProfilePerson;

/* renamed from: aqwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqwo extends Loader implements rkl {

    /* renamed from: a */
    private final String f86985a;

    /* renamed from: b */
    private final String f86986b;

    /* renamed from: c */
    private final String f86987c;

    /* renamed from: d */
    private aqwn f86988d;

    /* renamed from: e */
    private final rjx f86989e;

    public aqwo(Context context, String str, String str2, String str3, int i) {
        super(context);
        this.f86985a = str;
        this.f86986b = str2;
        this.f86987c = str3;
        allp a = allq.m61232a();
        a.f73626a = i;
        this.f86989e = allr.m61235b(context, a.mo40491a());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9454a(rkk rkk) {
        int i;
        alvj alvj = (alvj) rkk;
        if (!alvj.mo40809d()) {
            i = alvj.mo40810e() ? 2 : 3;
        } else {
            i = 1;
        }
        rtp b = alvj.mo40808b();
        if (b != null) {
            try {
                if (b.mo24660a() > 0) {
                    aqwn aqwn = new aqwn((SmartProfilePerson) b.mo24661a(0), i);
                    this.f86988d = aqwn;
                    deliverResult(aqwn);
                }
                if (i == 1) {
                    b.mo12460c();
                }
            } catch (Throwable th) {
                if (i == 1) {
                    b.mo12460c();
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onReset() {
        super.onReset();
        onStopLoading();
    }

    /* access modifiers changed from: protected */
    public final void onStartLoading() {
        super.onStartLoading();
        takeContentChanged();
        this.f86988d = null;
        alvm alvm = new alvm();
        alvm.f74390b = true;
        alvm.mo40814b();
        alvm.f74392d = this;
        alvk alvk = new alvk();
        if (!TextUtils.isEmpty(this.f86986b)) {
            alvk.f74381a = this.f86986b;
        } else {
            alvk.f74381a = "";
        }
        if (!TextUtils.isEmpty(this.f86987c)) {
            alvk.f74382b = this.f86987c;
        }
        alvm.mo40813a(alvk.mo40811a());
        alvn a = alvm.mo40812a();
        rjx rjx = this.f86989e;
        alwz alwz = new alwz();
        String str = this.f86985a;
        rjo rjo = allr.f73629a;
        rkb rkb = rjx.f43165D;
        sdo.m34974b(true ^ TextUtils.isEmpty(str));
        alxh alxh = new alxh(rkb, a, alwz, new String[]{str});
        rkb.mo24787a((rle) alxh);
        rkl rkl = a.f74397e;
        if (rkl != null) {
            alxh.mo9458a(rkl);
        }
        alxh.mo9458a((rkl) this);
    }
}
