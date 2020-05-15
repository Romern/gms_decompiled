package p000;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bqei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqei extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    private transient AtomicLong value;

    public bqei() {
        this(0.0d);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.value = new AtomicLong();
        mo69164a(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(mo69163a());
    }

    /* renamed from: a */
    public final double mo69163a() {
        return Double.longBitsToDouble(this.value.get());
    }

    public final double doubleValue() {
        return mo69163a();
    }

    public final float floatValue() {
        return (float) mo69163a();
    }

    public final int intValue() {
        return (int) mo69163a();
    }

    public final long longValue() {
        return (long) mo69163a();
    }

    public final String toString() {
        return Double.toString(mo69163a());
    }

    public bqei(double d) {
        this.value = new AtomicLong(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo69164a(double d) {
        this.value.set(Double.doubleToRawLongBits(d));
    }
}
