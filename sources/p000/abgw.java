package p000;

import android.text.TextUtils;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.helpactivities.HelpChimeraActivity;
import java.util.Map;

/* renamed from: abgw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abgw extends aaru {

    /* renamed from: e */
    private final HelpChimeraActivity f57441e;

    /* renamed from: f */
    private final HelpConfig f57442f;

    /* renamed from: g */
    private final abcr f57443g;

    public abgw(HelpChimeraActivity helpChimeraActivity) {
        super(helpChimeraActivity);
        this.f57441e = helpChimeraActivity;
        this.f57442f = helpChimeraActivity.f56986y;
        this.f57443g = helpChimeraActivity.f56987z;
    }

    /* renamed from: a */
    static String m47700a(abef abef) {
        int i = abef.f57187a;
        if (i != 1) {
            return i == 2 ? String.valueOf(((Boolean) abef.f57188b).booleanValue()) : "";
        }
        return (String) abef.f57188b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo31662b(Object obj) {
        String str;
        aars aars;
        aars aars2;
        abeg abeg = (abeg) obj;
        if (abeg == null) {
            this.f57441e.mo43323I();
            return;
        }
        if (ceiq.m136944b() && !TextUtils.isEmpty(this.f57442f.f78812L)) {
            str = this.f57442f.f78812L;
        } else {
            str = this.f57442f.f78827b;
        }
        Map b = aars.m46806b();
        abee a = aatb.m46959a(String.format("%s:%s", aars.f56380d.f56397u.f57183b, str));
        C1223np npVar = new C1223np(abeg.f57192b.size() + abeg.f57193c.size() + 2);
        npVar.put(aars.f56378b, Integer.toString(abeg.f57191a));
        npVar.put(aars.f56379c, abeg.f57194d);
        bxwc bxwc = abeg.f57192b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            abed abed = (abed) bxwc.get(i);
            abee abee = abed.f57177a;
            if (abee == null) {
                abee = abee.f57180d;
            }
            if (!aars.m46804a(abee, a)) {
                abee abee2 = abed.f57177a;
                if (abee2 == null) {
                    abee2 = abee.f57180d;
                }
                aars2 = (aars) b.get(new aarr(abee2));
            } else {
                aars2 = aars.f56380d;
            }
            if (aars2 != null) {
                abef abef = abed.f57178b;
                if (abef == null) {
                    abef = abef.f57185c;
                }
                npVar.put(aars2, m47700a(abef));
            }
        }
        bxwc bxwc2 = abeg.f57193c;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            abed abed2 = (abed) bxwc2.get(i2);
            abee abee3 = abed2.f57177a;
            if (abee3 == null) {
                abee3 = abee.f57180d;
            }
            if (aars.m46804a(abee3, a)) {
                aars = aars.f56380d;
            } else {
                abee abee4 = abed2.f57177a;
                if (abee4 == null) {
                    abee4 = abee.f57180d;
                }
                aars = aars.m46803a(abee4.f57183b);
            }
            if (aars != null) {
                abef abef2 = abed2.f57178b;
                if (abef2 == null) {
                    abef2 = abef.f57185c;
                }
                npVar.put(aars, m47700a(abef2));
            }
        }
        aars[] a2 = aars.m46805a();
        for (int i3 = 0; i3 < 9; i3++) {
            String str2 = (String) npVar.get(a2[i3]);
            if (!TextUtils.isEmpty(str2)) {
                npVar.put(a2[i3], aatf.m46975a(str2));
            }
        }
        aasa a3 = new aasc(this.f57441e, this.f57442f).mo31695a();
        a3.mo31692b(this.f57442f.f78813M);
        a3.mo31691a(npVar);
        a3.mo31685a();
        this.f57442f.f78813M = npVar;
        this.f57441e.mo43323I();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (ssk.m36235a(this.f57441e)) {
            return abfh.m47611a(this.f57441e.getApplicationContext(), this.f57442f, this.f57441e.f78958e, this.f57443g);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31660a() {
        this.f57441e.mo43344c(this);
    }
}
