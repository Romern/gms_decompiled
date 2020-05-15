package p000;

import java.lang.reflect.Field;

/* renamed from: bnor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnor {

    /* renamed from: a */
    private final Field f131933a;

    public bnor(Field field) {
        this.f131933a = field;
        field.setAccessible(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo68206a(Object obj, int i) {
        try {
            this.f131933a.set(obj, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo68207a(Object obj, Object obj2) {
        try {
            this.f131933a.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
