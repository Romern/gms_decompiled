package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fonts.FontFetchResult;

/* renamed from: zyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zyc extends dcj implements IInterface {
    public zyc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fonts.internal.IFontsCallbacks");
    }

    /* renamed from: a */
    public final void mo31584a(FontFetchResult fontFetchResult) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, fontFetchResult);
        mo8528b(1, bj);
    }
}
