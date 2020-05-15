package p000;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: agkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agkk implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f65802a;

    /* renamed from: b */
    final /* synthetic */ Uri f65803b;

    /* renamed from: c */
    final /* synthetic */ String f65804c;

    /* renamed from: d */
    final /* synthetic */ String f65805d;

    /* renamed from: e */
    final /* synthetic */ agkl f65806e;

    public agkk(agkl agkl, boolean z, Uri uri, String str, String str2) {
        this.f65806e = agkl;
        this.f65802a = z;
        this.f65803b = uri;
        this.f65804c = str;
        this.f65805d = str2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agkm.a(java.lang.String, java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String, java.lang.String]
     candidates:
      agkm.a(java.lang.String, java.lang.String, java.lang.String):java.util.ArrayList
      agkm.a(java.lang.String, java.lang.String, android.os.Bundle):void
      agkm.a(java.lang.String, java.lang.String, java.lang.Object):void */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0133, code lost:
        if (r0.containsKey("gclid") == false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r2.f65807a.mo35538v().mo35314a(p000.aghn.f65477ac) == false) goto L_0x009e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a3 A[SYNTHETIC, Splitter:B:32:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0103 A[Catch:{ Exception -> 0x01d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0114 A[SYNTHETIC, Splitter:B:52:0x0114] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0146 A[Catch:{ Exception -> 0x01d6 }] */
    public final void run() {
        Bundle bundle;
        Bundle bundle2;
        agkl agkl = this.f65806e;
        boolean z = this.f65802a;
        Uri uri = this.f65803b;
        String str = this.f65804c;
        String str2 = this.f65805d;
        agkl.f65807a.mo35241h();
        try {
            if (!agkl.f65807a.mo35538v().mo35314a(aghn.f65476ab)) {
                if (!agkl.f65807a.mo35538v().mo35314a(aghn.f65478ad)) {
                }
            }
            agms x = agkl.f65807a.mo35540x();
            if (!TextUtils.isEmpty(str2)) {
                if (!str2.contains("gclid")) {
                    if (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium")) {
                        x.mo35497E().f65571j.mo35435a("Activity created with data 'referrer' without required params");
                    }
                }
                String valueOf = String.valueOf(str2);
                bundle = x.mo35722a(Uri.parse(valueOf.length() == 0 ? new String("https://google.com/search?") : "https://google.com/search?".concat(valueOf)));
                if (bundle != null) {
                    bundle.putString("_cis", "referrer");
                }
                if (!z) {
                    bundle2 = agkl.f65807a.mo35540x().mo35722a(uri);
                    if (bundle2 != null) {
                        bundle2.putString("_cis", "intent");
                        if (agkl.f65807a.mo35538v().mo35314a(aghn.f65476ab)) {
                            if (!bundle2.containsKey("gclid") && bundle != null && bundle.containsKey("gclid")) {
                                bundle2.putString("_cer", String.format("gclid=%s", bundle.getString("gclid")));
                            }
                        }
                        agkl.f65807a.mo35570a(str, "_cmp", bundle2);
                        if (agkl.f65807a.mo35538v().mo35314a(aghn.f65473aB)) {
                            agkl.f65807a.f65810d.mo35296a(str, bundle2);
                        }
                    }
                } else {
                    bundle2 = null;
                }
                if (agkl.f65807a.mo35538v().mo35314a(aghn.f65478ad)) {
                    if (!agkl.f65807a.mo35538v().mo35314a(aghn.f65477ac)) {
                        if (bundle != null && bundle.containsKey("gclid")) {
                            if (bundle2 == null) {
                            }
                            agkl.f65807a.mo35572a("auto", "_lgclid", (Object) bundle.getString("gclid"));
                        }
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    agkl.f65807a.mo35497E().f65571j.mo35436a("Activity created with referrer", str2);
                    if (!agkl.f65807a.mo35538v().mo35314a(aghn.f65477ac)) {
                        if (str2.contains("gclid")) {
                            if (str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_term") || str2.contains("utm_content")) {
                                if (!TextUtils.isEmpty(str2)) {
                                    agkl.f65807a.mo35572a("auto", "_ldl", (Object) str2);
                                    return;
                                }
                                return;
                            }
                        }
                        agkl.f65807a.mo35497E().f65571j.mo35435a("Activity created with data 'referrer' without required params");
                        return;
                    }
                    if (bundle != null) {
                        agkl.f65807a.mo35570a(str, "_cmp", bundle);
                        if (agkl.f65807a.mo35538v().mo35314a(aghn.f65473aB)) {
                            agkl.f65807a.f65810d.mo35296a(str, bundle);
                        }
                    } else {
                        agkl.f65807a.mo35497E().f65571j.mo35436a("Referrer does not contain valid parameters", str2);
                    }
                    agkl.f65807a.mo35572a("auto", "_ldl", (Object) null);
                    return;
                }
                return;
            }
            bundle = null;
            if (!z) {
            }
            if (agkl.f65807a.mo35538v().mo35314a(aghn.f65478ad)) {
            }
            if (TextUtils.isEmpty(str2)) {
            }
        } catch (Exception e) {
            agkl.f65807a.mo35497E().f65564c.mo35436a("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }
}
