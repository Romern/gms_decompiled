package p000;

import android.content.Context;
import android.content.pm.PackageInstaller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: oqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oqx {

    /* renamed from: e */
    public static final /* synthetic */ int f38257e = 0;

    /* renamed from: a */
    public final Context f38258a;

    /* renamed from: b */
    public final PackageInstaller f38259b;

    /* renamed from: c */
    public final oye f38260c;

    /* renamed from: d */
    public final List f38261d;

    static {
        odk.m28481a("CAR.SETUP");
    }

    public oqx(Context context, otw otw) {
        String str;
        this.f38258a = context;
        this.f38259b = context.getPackageManager().getPackageInstaller();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new oyg(ccui.m131663c(), pby.f38802a));
        arrayList.add(new oyf(ccui.f179964a.mo6606a().mo76823g()));
        arrayList.add(new oyf(ccui.f179964a.mo6606a().mo76824h()));
        arrayList.add(new oyf(ccui.m131664d()));
        arrayList.add(new oyf(ccui.f179964a.mo6606a().mo76826j()));
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            oyf oyf = (oyf) arrayList.get(i);
            hashMap.put(oyf.f38609a, oyf);
        }
        if (otw != null) {
            bxwc bxwc = cctr.f179907a.mo6606a().mo76767a().f180141a;
            int size2 = bxwc.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ccwy ccwy = (ccwy) bxwc.get(i2);
                if (otw.mo22641h() > ccwy.f180134a || (otw.mo22641h() >= ccwy.f180134a && otw.f38441c.f29539a.f29337f >= ccwy.f180135b)) {
                    String str2 = ccwy.f180136c;
                    int i3 = (int) ccwy.f180137d;
                    if (hashMap.containsKey(str2)) {
                        oyf oyf2 = (oyf) hashMap.get(str2);
                        str = oyf2.f38610b;
                        i3 = Math.max(oyf2.f38611c, i3);
                    } else {
                        str = null;
                    }
                    hashMap.put(str2, new oyf(str2, str, i3));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (oyf oyf3 : hashMap.values()) {
            if (!oyf3.f38609a.isEmpty()) {
                arrayList2.add(oyf3);
            }
        }
        this.f38261d = Collections.unmodifiableList(arrayList2);
        this.f38260c = new oye();
        for (oyf oyf4 : this.f38261d) {
            oye oye = this.f38260c;
            String str3 = oyf4.f38609a;
            String str4 = oyf4.f38610b;
            oye.f38608a.put(str3, new oyd(oyf4.mo22781b(this.f38258a), str4));
        }
    }

    /* renamed from: a */
    public static oqx m29633a(Context context, otw otw) {
        return new oqx(context, otw);
    }

    /* renamed from: b */
    public static bpdu m29634b(String str) {
        if (str.equals("com.google.android.projection.gearhead")) {
            return bpdu.GEARHEAD;
        }
        if (str.equals("com.google.android.apps.maps")) {
            return bpdu.GMM;
        }
        if (str.equals("com.google.android.music")) {
            return bpdu.GPM;
        }
        if (str.equals("com.google.android.apps.maps")) {
            return bpdu.GMM;
        }
        if (str.equals("com.google.android.tts")) {
            return bpdu.TTS;
        }
        if (str.equals("com.locnall.KimGiSa")) {
            return bpdu.KAKAO_NAVI;
        }
        if (str.equals("com.waze")) {
            return bpdu.WAZE;
        }
        return bpdu.UNKNOWN_APPLICATION;
    }

    /* renamed from: a */
    public final PackageInstaller.SessionInfo mo22526a(String str) {
        for (PackageInstaller.SessionInfo sessionInfo : this.f38259b.getAllSessions()) {
            if (str.equals(sessionInfo.getAppPackageName())) {
                return sessionInfo;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final List mo22527a() {
        ArrayList arrayList = new ArrayList(this.f38261d.size());
        for (oyf oyf : this.f38261d) {
            if (!oyf.mo22779a(this.f38258a)) {
                arrayList.add(oyf.f38609a);
            }
        }
        return arrayList;
    }
}
