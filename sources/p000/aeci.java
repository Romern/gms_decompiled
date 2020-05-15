package p000;

import android.content.Context;
import android.os.Binder;
import android.os.Parcel;
import android.util.Log;

/* renamed from: aeci */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aeci extends Binder {

    /* renamed from: c */
    private static final int f63134c = spn.f44932a;

    /* renamed from: a */
    private final Binder f63135a;

    /* renamed from: b */
    private final Context f63136b;

    public aeci(Context context, Binder binder) {
        this.f63136b = context;
        this.f63135a = binder;
    }

    /* access modifiers changed from: protected */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            int callingUid = Binder.getCallingUid();
            if (callingUid != f63134c) {
                if (!str.m36311a(this.f63136b, Binder.getCallingUid(), "com.google.android.gms")) {
                    Log.e("ZeroPartyBinder", "Unexpected package bound to the service");
                    throw new SecurityException("Unexpected uid");
                } else if (this.f63136b.getPackageManager().checkSignatures(callingUid, f63134c) < 0) {
                    Log.e("ZeroPartyBinder", "Incorrect caller's signature");
                    throw new SecurityException("Wrong signature");
                }
            }
            return this.f63135a.transact(i, parcel, parcel2, i2);
        } catch (SecurityException e) {
            if (parcel2 == null) {
                return false;
            }
            parcel2.writeException(e);
            return false;
        }
    }
}
