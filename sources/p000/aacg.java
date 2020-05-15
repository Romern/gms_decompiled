package p000;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* renamed from: aacg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aacg extends Binder {

    /* renamed from: a */
    final aaaz f27927a;

    /* renamed from: b */
    private volatile Binder f27928b;

    /* renamed from: c */
    private final zzp f27929c;

    /* renamed from: d */
    private final int f27930d;

    /* renamed from: e */
    private final aaay f27931e;

    public aacg(Context context, Binder binder) {
        this(binder, context, null, -1, 0);
    }

    /* renamed from: a */
    public static boolean m21082a(IBinder iBinder) {
        String interfaceDescriptor;
        return (iBinder instanceof Binder) && !(iBinder instanceof aacg) && (interfaceDescriptor = ((Binder) iBinder).getInterfaceDescriptor()) != null && !interfaceDescriptor.equals("android.service.notification.IConditionProvider");
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        if (i > 16777215) {
            return this.f27928b.transact(i, parcel, parcel2, i2);
        }
        zzp zzp = Binder.getCallingUid() == this.f27930d ? this.f27929c : null;
        if (this.f27931e != null) {
            int dataPosition = parcel.dataPosition();
            try {
                int dataSize = parcel.dataSize() - 8;
                if (dataSize > 0) {
                    parcel.setDataPosition(dataSize);
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != -1205835348) {
                        throw new aaax("bad magic suffix");
                    } else if (readInt < 0 || readInt >= dataSize) {
                        StringBuilder sb = new StringBuilder(58);
                        sb.append("length out of range: ");
                        sb.append(readInt);
                        sb.append(" should be [0,");
                        sb.append(dataSize);
                        sb.append(")");
                        throw new aaax(sb.toString());
                    } else {
                        parcel.setDataPosition(dataSize - readInt);
                        str = parcel.readString();
                        parcel.setDataPosition(dataPosition);
                        zzp = aabb.m21045a(str, zzp);
                    }
                } else {
                    throw new aaax("parcel too small");
                }
            } catch (aaax e) {
                Log.e("BinderPropagation", e.getMessage(), e);
                str = "binderprop_error";
            } catch (Throwable th) {
                parcel.setDataPosition(dataPosition);
                throw th;
            }
        }
        blji a = this.f27927a.mo16672a(i, bmzn.m108683a(zzp));
        try {
            if ((this.f27928b instanceof aaai) || (this.f27928b instanceof sjr)) {
                aabk c = aach.m21088c();
                if (c != null) {
                    c.f27887c = true;
                }
            }
            boolean transact = this.f27928b.transact(i, parcel, parcel2, i2);
            if (a != null) {
                a.close();
            }
            return transact;
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
        throw th;
    }

    public aacg(Binder binder, Context context, zzp zzp, int i, int i2) {
        String interfaceDescriptor = binder.getInterfaceDescriptor();
        this.f27928b = binder;
        this.f27929c = zzp;
        this.f27930d = i;
        this.f27931e = i2 != 0 ? aaay.m21039a() : null;
        attachInterface(binder.queryLocalInterface(interfaceDescriptor), interfaceDescriptor);
        this.f27927a = new aaaz(context, binder);
    }
}
