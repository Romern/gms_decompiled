package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.nio.charset.Charset;

/* renamed from: aaoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaoa extends aany {
    public aaoa(Context context) {
        super(context, "fcm_queued_messages.ldb");
    }

    /* renamed from: b */
    public static byte[] m21735b(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: a */
    public final bmxv mo17168a(String str) {
        return mo17158a(m21735b(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bmxv mo17165c(bxvk bxvk) {
        aajz aajz = (aajz) bxvk;
        if (aajz == null) {
            Log.w("GCM", "Provided QueuedMessage is null.");
        } else if ((aajz.f28332a & 2) == 0) {
            Log.w("GCM", "Stanza message was not populated.");
        } else {
            blmp blmp = aajz.f28334c;
            if (blmp == null) {
                blmp = blmp.f126864r;
            }
            if (TextUtils.isEmpty(blmp.f126873h)) {
                Log.w("GCM", "PersistentId was not populated.");
            } else {
                blmp blmp2 = aajz.f28334c;
                if (blmp2 == null) {
                    blmp2 = blmp.f126864r;
                }
                return bmxv.m108566b(m21735b(blmp2.f126873h));
            }
        }
        return bmvz.f131120a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxvk mo17166c(byte[] bArr) {
        return (aajz) bxvk.m124014a(aajz.f28330e, bArr);
    }
}
