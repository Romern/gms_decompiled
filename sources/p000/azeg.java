package p000;

import android.content.Context;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: azeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azeg {

    /* renamed from: a */
    private static azeg f99160a;

    private azeg() {
    }

    /* renamed from: a */
    public static final List m85518a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(128);
        arrayList.add(129);
        arrayList.add(130);
        arrayList.add(131);
        arrayList.add(132);
        arrayList.add(136);
        if (cffm.f183935a.mo6606a().mo81121b()) {
            azdl a = azdl.m85412a(context);
            if ((!cffs.f183946a.mo6606a().mo81129a() || a.mo54736J()) && C1145kt.m18540a(context, "android.permission.RECORD_AUDIO") == 0 && C1145kt.m18540a(context, "android.permission.CAMERA") == 0) {
                arrayList.add(65);
                arrayList.add(64);
                if (cfeo.f183719a.mo6606a().mo80972af()) {
                    arrayList.add(74);
                }
            }
        }
        if (cfeo.f183719a.mo6606a().mo81057ci() && azan.m85141a(context).mo54542b()) {
            arrayList.add(139);
        }
        if (cfec.m138765b()) {
            arrayList.add(140);
            if (cffm.f183935a.mo6606a().mo81122c()) {
                arrayList.add(87);
            }
            if (cffm.f183935a.mo6606a().mo81123d()) {
                arrayList.add(86);
            }
        }
        if (cfgs.f183989a.mo6606a().mo81152H()) {
            arrayList.add(141);
            if (cfex.m139275b()) {
                arrayList.add(145);
            }
        }
        if (cfgj.m139365b()) {
            arrayList.add(142);
        }
        if (cfdn.m138737b()) {
            arrayList.add(143);
        }
        azqf.m86130a(context);
        if (azqf.m86149c()) {
            arrayList.add(Integer.valueOf((int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final int[] m85520b(Context context) {
        List a = m85518a(context);
        int[] iArr = new int[a.size()];
        int size = a.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            iArr[i2] = ((Integer) a.get(i)).intValue();
            i++;
            i2++;
        }
        return iArr;
    }

    /* renamed from: a */
    public static synchronized void m85519a() {
        synchronized (azeg.class) {
            if (f99160a == null) {
                f99160a = new azeg();
            }
        }
    }
}
