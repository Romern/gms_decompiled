package p000;

import android.content.Context;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: aerq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aerq extends aero implements aerh {

    /* renamed from: i */
    public static final /* synthetic */ int f63691i = 0;

    /* renamed from: j */
    private static final bmyx f63692j = bmyx.m108640a(',').mo66917a();

    /* renamed from: k */
    private final aerf f63693k;

    public aerq(Context context, aeri aeri) {
        super(context, aeri);
        this.f63693k = new aerf(context, aerp.f63690a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34492a() {
        this.f63693k.mo34476a(Settings.Secure.getUriFor("location_providers_allowed"), this, new sty(Looper.getMainLooper()));
        String string = Settings.Secure.getString(this.f63682a.getContentResolver(), "location_providers_allowed");
        if (!TextUtils.isEmpty(string)) {
            for (String str : f63692j.mo66918a((CharSequence) string)) {
                mo34493a(str, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo34494b() {
        this.f63693k.mo34475a(this);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo34477a(Object obj) {
        Set set;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            set = new C1225nr();
        } else {
            set = bnpf.m110049a(f63692j.mo66918a((CharSequence) str));
        }
        synchronized (this.f63684c) {
            C1225nr nrVar = this.f63687f;
            bmxy.m108582a(nrVar, "set1");
            bmxy.m108582a(set, "set2");
            Iterator it = new HashSet(new bnpb(nrVar, set)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                mo34493a(str2, set.contains(str2));
            }
        }
    }
}
