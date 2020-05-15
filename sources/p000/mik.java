package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: mik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mik {

    /* renamed from: a */
    private static final lvn f33777a = new lvn("P2PRAppProtoParser");

    /* renamed from: a */
    public static mih m25177a(Bundle bundle) {
        String string = bundle.getString(mip.f33789a);
        byte[] byteArray = bundle.getByteArray(mip.f33790b);
        ArrayList a = bnkn.m109661a();
        mie mie = null;
        if (string == null || byteArray == null) {
            f33777a.mo25418e("No package name or apks found. Returning null", new Object[0]);
            return null;
        }
        try {
            bzzf bzzf = (bzzf) bxvk.m124016a(bzzf.f171967d, byteArray, bxus.m123744c());
            if (bzzf != null) {
                f33777a.mo25412b("APK details received", new Object[0]);
                f33777a.mo25412b(string.length() == 0 ? new String("Package Name:") : "Package Name:".concat(string), new Object[0]);
                if ((bzzf.f171969a & 2) != 0) {
                    bzze bzze = bzzf.f171970b;
                    if (bzze == null) {
                        bzze = bzze.f171962c;
                    }
                    String str = bzze.f171964a;
                    bzze bzze2 = bzzf.f171970b;
                    if (bzze2 == null) {
                        bzze2 = bzze.f171962c;
                    }
                    mie mie2 = new mie(str, bzze2.f171965b);
                    lvn lvn = f33777a;
                    String valueOf = String.valueOf(mie2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    sb.append("Base apk details: ");
                    sb.append(valueOf);
                    lvn.mo25412b(sb.toString(), new Object[0]);
                    if (!bzzf.f171971c.isEmpty()) {
                        f33777a.mo25412b("Split details:", new Object[0]);
                        bxwc bxwc = bzzf.f171971c;
                        int size = bxwc.size();
                        for (int i = 0; i < size; i++) {
                            bzze bzze3 = (bzze) bxwc.get(i);
                            mid mid = new mid(bzze3.f171964a, bzze3.f171965b);
                            a.add(mid);
                            lvn lvn2 = f33777a;
                            String valueOf2 = String.valueOf(mid);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length());
                            sb2.append(valueOf2);
                            lvn2.mo25412b(sb2.toString(), new Object[0]);
                        }
                    }
                    mie = mie2;
                } else {
                    f33777a.mo25418e("No base master apk found. Returning null", new Object[0]);
                    return null;
                }
            }
            return new mic(string, mie, bngx.m109368a((Collection) a));
        } catch (bxwf e) {
            f33777a.mo25418e("invalid protocol exception", new Object[0]);
            return null;
        }
    }
}
