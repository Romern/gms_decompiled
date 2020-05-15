package com.google.android.gms.platformconfigurator;

import android.content.Intent;
import android.net.Uri;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PackageUpdateIntentOperation extends qlg {
    public PackageUpdateIntentOperation() {
        super(false);
    }

    /* renamed from: a */
    private static bngx m68271a() {
        bngs bngs = new bngs();
        bngs.mo67666b((Iterable) cghk.m145458j().f165797a);
        if (cghk.m145452d()) {
            bngs.mo67666b((Iterable) cghk.m145457i().f165797a);
        }
        return bngs.mo67664a();
    }

    /* renamed from: e */
    static final bngx m68272e(String str) {
        if (str.isEmpty()) {
            return bngx.m109376e();
        }
        bngs bngs = new bngs();
        bnre i = m68271a().listIterator();
        while (i.hasNext()) {
            String str2 = (String) i.next();
            if (str.equals(ankh.m64643b(str2))) {
                bngs.mo67668c(ankh.m64638a(str2));
            }
        }
        return bngs.mo67664a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo24072b(String str) {
        bnre i = m68272e(str).listIterator();
        while (i.hasNext()) {
            ankh.m64640a((String) i.next(), str, this);
        }
    }

    public final void onHandleIntent(Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if (cghk.m145451c() && cghk.m145453e() && ankk.m64653a() && !bmxx.m108577a(str)) {
            bnre i = m68271a().listIterator();
            while (i.hasNext()) {
                if (str.equals(ankh.m64643b((String) i.next()))) {
                    super.onHandleIntent(intent);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo24071a(String str) {
        bnre i = m68272e(str).listIterator();
        while (i.hasNext()) {
            ankh.m64640a((String) i.next(), str, this);
        }
    }
}
