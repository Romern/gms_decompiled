package p000;

import android.os.Bundle;
import android.os.Parcelable;

/* renamed from: ims */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ims {

    /* renamed from: a */
    public final Bundle f21367a;

    public ims() {
        this(null);
    }

    /* renamed from: a */
    public final Object mo13146a(imr imr) {
        return this.f21367a.get(imr.f21366a);
    }

    /* renamed from: b */
    public final void mo13148b(imr imr, Object obj) {
        Bundle bundle = this.f21367a;
        if (obj == null) {
            bundle.putString(imr.f21366a, null);
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(imr.f21366a, ((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(imr.f21366a, (boolean[]) obj);
        } else if (obj instanceof Byte) {
            bundle.putByte(imr.f21366a, ((Byte) obj).byteValue());
        } else if (obj instanceof byte[]) {
            bundle.putByteArray(imr.f21366a, (byte[]) obj);
        } else if (obj instanceof CharSequence) {
            bundle.putCharSequence(imr.f21366a, (CharSequence) obj);
        } else if (obj instanceof CharSequence[]) {
            bundle.putCharSequenceArray(imr.f21366a, (CharSequence[]) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(imr.f21366a, ((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            bundle.putIntArray(imr.f21366a, (int[]) obj);
        } else if (obj instanceof Long) {
            bundle.putLong(imr.f21366a, ((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            bundle.putLongArray(imr.f21366a, (long[]) obj);
        } else if (obj instanceof String) {
            bundle.putString(imr.f21366a, (String) obj);
        } else if (obj instanceof String[]) {
            bundle.putStringArray(imr.f21366a, (String[]) obj);
        } else if (obj instanceof Bundle) {
            bundle.putBundle(imr.f21366a, (Bundle) obj);
        } else if (obj instanceof Parcelable) {
            bundle.putParcelable(imr.f21366a, (Parcelable) obj);
        } else if (obj instanceof Parcelable[]) {
            bundle.putParcelableArray(imr.f21366a, (Parcelable[]) obj);
        } else {
            String valueOf = String.valueOf(obj.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("Class of value unsupported: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public ims(Bundle bundle) {
        this.f21367a = bundle == null ? new Bundle() : bundle;
    }

    /* renamed from: a */
    public final Object mo13147a(imr imr, Object obj) {
        return mo13149b(imr) ? mo13146a(imr) : obj;
    }

    /* renamed from: b */
    public final boolean mo13149b(imr imr) {
        return this.f21367a.containsKey(imr.f21366a);
    }
}
