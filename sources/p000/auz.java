package p000;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* renamed from: auz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class auz extends ObjectInputStream {
    public auz(InputStream inputStream) {
        super(inputStream);
    }

    /* access modifiers changed from: protected */
    public final Class resolveClass(ObjectStreamClass objectStreamClass) {
        Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
        return cls == null ? super.resolveClass(objectStreamClass) : cls;
    }
}
