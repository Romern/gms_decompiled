package p000;

import android.content.Context;
import android.content.Intent;
import android.view.accessibility.AccessibilityManager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;

/* renamed from: ahvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahvn extends ahvo {

    /* renamed from: a */
    private final ahvb f68168a;

    /* renamed from: b */
    private final String f68169b;

    /* renamed from: f */
    private final byte[] f68170f;

    /* renamed from: g */
    private final boolean f68171g;

    public ahvn(Context context, ahsu ahsu, String str, byte[] bArr, ahvb ahvb) {
        super(context, ahsu);
        this.f68168a = ahvb;
        this.f68169b = str;
        this.f68170f = bArr;
        byte[] n = ahsu.mo37089n();
        boolean z = false;
        if (!(n == null || bArr == null)) {
            z = true;
        }
        this.f68171g = z;
    }

    /* renamed from: a */
    public final bvjc mo37144a() {
        return !this.f68171g ? bvjc.MAGIC_PAIR_START : bvjc.SUBSEQUENT_PAIR_START;
    }

    /* renamed from: b */
    public final bvjc mo37150b() {
        return !this.f68171g ? bvjc.MAGIC_PAIR_END : bvjc.SUBSEQUENT_PAIR_END;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: je.a(int, int, boolean):void
     arg types: [int, int, int]
     candidates:
      je.a(int, java.lang.CharSequence, android.app.PendingIntent):void
      je.a(int, int, boolean):void */
    /* renamed from: e */
    public final void mo37207e() {
        super.mo37207e();
        ahvb ahvb = this.f68168a;
        ((aidb) ahgz.m55754a(ahvb.f68143e, aidb.class)).f68780a = false;
        if (cfom.m141867b() && cfoj.m141533N()) {
            ((ahgp) ahgz.m55754a(ahvb.f68143e, ahgp.class)).mo36449a(ahvb.f68138d);
        }
        String string = ahvb.f68143e.getString(C0126R.string.common_connecting);
        aicx b = ahvb.mo37196b();
        b.mo37421b(string);
        b.f22269u = "progress";
        b.mo13640e(ahvb.mo37198c());
        b.mo13632b((CharSequence) string);
        b.mo13617a(0, 0, true);
        String i = ahvb.f68144f.mo37084i();
        b.mo13631b(ahvb.mo37187a(DiscoveryChimeraService.m67336a(((aicw) ahgz.m55754a(ahvb.f68143e, aicw.class)).f68735a).setAction("com.google.android.gms.nearby.discovery.ACTION_MAGIC_PAIR_PAIRING_DISMISS").putExtra("com.google.android.gms.nearby.discovery.EXTRA_ITEM_ID", i).putExtra("com.google.android.gms.nearby.discovery.EXTRA_PRIORITY", aidc.m57025a("DEVICES_WITHIN_REACH_REBRANDED"))));
        b.mo13627a(false);
        AccessibilityManager accessibilityManager = (AccessibilityManager) ahvb.f68143e.getSystemService("accessibility");
        if (cfoj.m141542W() || !accessibilityManager.isTouchExplorationEnabled()) {
            b.mo13635c(ahvb.mo37187a(new Intent()));
        }
        ahvb.mo37192a(b.mo13629b(), ahvb.f68142a);
    }

    /* renamed from: a */
    public final String mo37145a(aypk aypk, byte[] bArr, buru buru, String str) {
        String str2;
        String a = super.mo37145a(aypk, bArr, buru, str);
        ahvb ahvb = this.f68168a;
        if (ahur.m56677a(this.f68169b)) {
            str2 = this.f68169b;
        } else {
            str2 = null;
        }
        ahvb.mo37193a(str2, buqx.m120256a(this.f68174d.mo37088m()), a, str);
        return a;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahvb.a(boolean, boolean, java.lang.String, java.lang.String):void
     arg types: [int, int, java.lang.String, java.lang.String]
     candidates:
      ahvb.a(boolean, android.content.Intent, bvin, java.lang.String):android.app.PendingIntent
      ahvb.a(java.lang.String, int, java.lang.String, java.lang.String):void
      ahvb.a(boolean, boolean, java.lang.String, java.lang.String):void */
    /* renamed from: b */
    public final void mo37151b(String str) {
        super.mo37151b(str);
        this.f68168a.mo37195a(true, false, this.f68174d.mo37088m(), str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ahvb.a(boolean, boolean, java.lang.String, java.lang.String):void
     arg types: [int, int, java.lang.String, ?[OBJECT, ARRAY]]
     candidates:
      ahvb.a(boolean, android.content.Intent, bvin, java.lang.String):android.app.PendingIntent
      ahvb.a(java.lang.String, int, java.lang.String, java.lang.String):void
      ahvb.a(boolean, boolean, java.lang.String, java.lang.String):void */
    /* renamed from: a */
    public final void mo37148a(Throwable th) {
        boolean z;
        super.mo37148a(th);
        ahvb ahvb = this.f68168a;
        byte[] bArr = this.f68170f;
        ((aidb) ahgz.m55754a(ahvb.f68143e, aidb.class)).mo37429a();
        if (!cfom.m141867b() || !cfoj.m141533N()) {
            ahvb.mo37192a(ahvb.mo37186a(bArr), ahvb.f68142a);
        } else {
            ((ahgp) ahgz.m55754a(ahvb.f68143e, ahgp.class)).mo36449a(ahvb.f68142a);
            ahvb.mo37192a(ahvb.mo37186a(bArr), ahvb.f68138d);
        }
        ahvb ahvb2 = this.f68168a;
        byte[] bArr2 = this.f68170f;
        String str = this.f68169b;
        if (cfoj.f184966a.mo6606a().mo82122at() && cfog.m141291s().equals(str)) {
            String a = ((ahsc) ahgz.m55754a(ahvb2.f68143e, ahsc.class)).mo37009a("fast_pair_send_feedback_title", new Object[0]);
            aicx b = ahvb2.mo37196b();
            b.mo37420a("DEVICES_REBRANDED");
            b.mo37421b(a);
            b.f22269u = "err";
            b.mo13640e(a);
            b.mo13632b((CharSequence) ((ahsc) ahgz.m55754a(ahvb2.f68143e, ahsc.class)).mo37009a("fast_pair_send_feedback_text", new Object[0]));
            aicw aicw = (aicw) ahgz.m55754a(ahvb2.f68143e, aicw.class);
            if (bArr2 == null) {
                z = true;
            } else {
                z = false;
            }
            b.mo13620a(ahvb2.mo37187a(DiscoveryChimeraService.m67336a(aicw.f68735a).setAction("com.google.android.gms.nearby.discovery.ACTION_USER_FEEDBACK").putExtra("com.google.android.gms.nearby.discovery.EXTRA_IS_INITIAL_PAIRING", z)));
            ahvb2.mo37192a(b.mo13629b(), ahvb.f68137c);
        }
        this.f68168a.mo37195a(false, false, this.f68174d.mo37088m(), (String) null);
    }
}
