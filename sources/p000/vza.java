package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Map;

/* renamed from: vza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vza {

    /* renamed from: a */
    public final Object f50268a;

    /* renamed from: b */
    public final byte[] f50269b;

    /* renamed from: c */
    public final vyj f50270c;

    public vza(Class cls, Context context, Parcelable parcelable) {
        this.f50269b = new byte[0];
        this.f50270c = null;
        try {
            this.f50268a = cls.getDeclaredConstructor(Context.class, Parcelable.class).newInstance(context, parcelable);
        } catch (Exception e) {
            throw new vyw(this.f50269b, e);
        }
    }

    /* renamed from: a */
    public final boolean mo28989a() {
        try {
            return ((Boolean) this.f50268a.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.f50268a, new Object[0])).booleanValue();
        } catch (Exception e) {
            throw new vyw(this.f50269b, e);
        }
    }

    /* renamed from: b */
    public final void mo28991b() {
        try {
            this.f50268a.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.f50268a, new Object[0]);
        } catch (Exception e) {
            throw new vyw(this.f50269b, e);
        }
    }

    /* renamed from: a */
    public final byte[] mo28990a(Map map) {
        try {
            return (byte[]) this.f50268a.getClass().getDeclaredMethod("run", Map.class).invoke(this.f50268a, map);
        } catch (Exception e) {
            throw new vyw(this.f50269b, e);
        }
    }

    public vza(Class cls, Context context, String str, vyj vyj, Object obj, byte[] bArr, Bundle bundle) {
        this.f50269b = bArr;
        this.f50270c = vyj;
        try {
            this.f50268a = cls.getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class).newInstance(context, str, vyj.f50235a, obj, bundle);
        } catch (Exception e) {
            throw new vyw(bArr, e);
        }
    }
}
