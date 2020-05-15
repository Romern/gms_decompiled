package p000;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;

/* renamed from: bjhq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjhq {
    /* renamed from: a */
    public static bxxc m103510a(Intent intent, String str, bxxc bxxc) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        if (!intent.hasExtra(str)) {
            return null;
        }
        bxus c = bxus.m123744c();
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra(str);
            if (parcelableExtra instanceof Bundle) {
                Bundle bundle = (Bundle) parcelableExtra;
                bundle.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
                protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle.getParcelable("protoparsers");
            } else {
                protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelableExtra;
            }
            return bxzl.m124567a(protoParsers$InternalDontUse, bxxc, c);
        } catch (bxwf e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static void m103513b(Intent intent, String str, bxxc bxxc) {
        if (bxxc != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, bxxc));
            intent.putExtra(str, bundle);
        }
    }

    /* renamed from: b */
    public static void m103514b(Bundle bundle, String str, bxxc bxxc) {
        if (bxxc != null) {
            bxzl.m124568a(bundle, str, bxxc);
        }
    }

    /* renamed from: a */
    public static bxxc m103511a(Bundle bundle, String str, bxxc bxxc) {
        if (bundle.containsKey(str)) {
            return bxzl.m124566a(bundle, str, bxxc, bxus.m123744c());
        }
        return null;
    }

    /* renamed from: a */
    public static bxxc m103512a(byte[] bArr, bxxk bxxk) {
        try {
            return (bxxc) bxxk.mo73662b(bArr, bxus.m123744c());
        } catch (bxwf e) {
            throw new IllegalArgumentException(e);
        }
    }
}
