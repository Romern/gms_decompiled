package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;

/* renamed from: pei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pei extends rjl {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ rjm mo11610a(Context context, Looper looper, sat sat, Object obj, rjz rjz, rka rka) {
        pek pek = (pek) obj;
        sdo.m34966a(pek, "Setting the API options is required.");
        CastDevice castDevice = pek.f38966a;
        int i = pek.f38969d;
        pel pel = pek.f38967b;
        Bundle bundle = pek.f38968c;
        return new pti(context, looper, sat, castDevice, pel, rjz, rka);
    }
}
