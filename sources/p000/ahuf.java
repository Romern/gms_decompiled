package p000;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ahuf */
public final /* synthetic */ class ahuf implements Runnable {

    /* renamed from: a */
    private final Context f68066a;

    /* renamed from: b */
    private final ahyz f68067b;

    /* renamed from: c */
    private final String f68068c;

    /* renamed from: d */
    private final byte[] f68069d;

    /* renamed from: e */
    private final boolean f68070e;

    /* renamed from: f */
    private final boolean f68071f;

    /* renamed from: g */
    private final double f68072g;

    /* renamed from: h */
    private final buru f68073h;

    public ahuf(Context context, ahyz ahyz, String str, byte[] bArr, boolean z, boolean z2, double d, buru buru) {
        this.f68066a = context;
        this.f68067b = ahyz;
        this.f68068c = str;
        this.f68069d = bArr;
        this.f68070e = z;
        this.f68071f = z2;
        this.f68072g = d;
        this.f68073h = buru;
    }

    public final void run() {
        String str;
        Context context = this.f68066a;
        ahyz ahyz = this.f68067b;
        String str2 = this.f68068c;
        byte[] bArr = this.f68069d;
        boolean z = this.f68070e;
        boolean z2 = this.f68071f;
        double d = this.f68072g;
        buru buru = this.f68073h;
        srn srn = ahsd.f67925a;
        if (ahur.m56678a(bArr) && cfoj.m141526G()) {
            ahur.m56671a(context, ahyz, bArr, z, d, buru, str2);
        }
        if (z2) {
            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: Need update provider name.");
            ahuy.m56685a(context, str2, ahyz);
        }
        if (cfoj.m141559i()) {
            boolean equals = ahyz.f68433g.equals(ahyz.f68432f);
            long a = ((sqv) ahgz.m55754a(context, sqv.class)).mo20505a() - ahyz.f68434h;
            long J = cfog.f184854a.mo6606a().mo81948J();
            if (!equals && a > J && ahyz.f68436j) {
                try {
                    ((buqh) ahgz.m55754a(context, buqh.class)).mo72982a(new ahuo("FastPairFirmwareVersion", context, ahyz));
                } catch (InterruptedException e) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: error happens when update fast pair firmware version.");
                }
                aiaa a2 = ahur.m56667a(context, ahyz, buru);
                String a3 = ahty.m56653a(context, str2, new ahti(ahyz.f68437k, ahyz.f68428b, context));
                if (a3 == null || a2 == null) {
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: device firmware number is not available");
                    ((buqh) ahgz.m55754a(context, buqh.class)).mo72987c(new ahtw("FastPairCacheEnableFirmwareVersionCheck", context, str2));
                    return;
                }
                bvkn a4 = ahty.m56652a(context, a2.f68537y);
                if (a4 != null) {
                    ((buqh) ahgz.m55754a(context, buqh.class)).mo72987c(new ahtx("FastPairCacheUpdateFirmwareVersionValue", context, ahyz, a3, a4));
                    if (!ahyz.f68432f.equals(a3)) {
                        if (ahur.m56677a(a2.f68518f)) {
                            str = ahvd.m56709a(a2);
                        } else {
                            str = null;
                        }
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68424a("FastPair: The latest firmware is %s device firmware version is %s", ahyz.f68432f, a3);
                        int i = a4.f156446a;
                        char c = 2;
                        boolean z3 = false;
                        if (i != 0) {
                            c = i != 1 ? i != 2 ? (char) 0 : 4 : 3;
                        }
                        if (c != 0 && c == 3) {
                            ahvb ahvb = new ahvb(context, new ahsu(context, a2), true);
                            ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: Showing critical firmware update available notification, companion app: %s.", str);
                            if (!TextUtils.isEmpty(str)) {
                                String a5 = ((ahsc) ahgz.m55754a(ahvb.f68143e, ahsc.class)).mo37009a("fast_pair_firmware_update_without_companion_app", new Object[0]);
                                Intent a6 = ahvb.mo37189a(str, (String) null);
                                String string = ahvb.f68143e.getString(C0126R.string.common_firmware_update);
                                aicx b = ahvb.mo37196b();
                                b.mo37421b(string);
                                b.f22269u = "status";
                                b.mo13640e(string);
                                b.mo13632b((CharSequence) a5);
                                b.mo13620a(ahvb.mo37197b(a6));
                                ahvb.mo37192a(b.mo13629b(), ahvb.f68142a);
                            }
                            z3 = true;
                        }
                        if (str != null && ahvd.m56713a(str, context)) {
                            Intent intent = new Intent("com.google.android.gms.nearby.fastpair.ACTION_FIRMWARE_UPDATE_BROADCAST");
                            intent.setPackage(str);
                            intent.putExtra("com.google.android.gms.nearby.fastpair.EXTRA_LOCAL_FIRMWARE_VERSION", a3);
                            intent.putExtra("com.google.android.gms.nearby.fastpair.EXTRA_UPDATE_NOTIFICATION_SHOWN", z3);
                            context.getApplicationContext().sendBroadcast(intent);
                            return;
                        }
                        return;
                    }
                    ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: firmware is latest version no need to update.");
                }
            }
        }
    }
}
