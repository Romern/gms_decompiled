package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* renamed from: azev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azev extends dck implements azew {

    /* renamed from: a */
    private final aztx f99211a;

    public azev() {
        super("com.google.android.libraries.matchstick.net.ILighterWebListener");
    }

    /* renamed from: a */
    public final void mo54852a(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(autoCloseInputStream, Charset.forName(bmwy.f131158c.name())));
            while (true) {
                int read = bufferedReader.read();
                if (read == -1) {
                    break;
                }
                sb.append((char) read);
            }
            String sb2 = sb.toString();
            String valueOf = String.valueOf(sb2);
            if (valueOf.length() == 0) {
                new String("evaluateJavascriptParcel: ");
            } else {
                "evaluateJavascriptParcel: ".concat(valueOf);
            }
            this.f99211a.mo54821a(sb2);
        } catch (IOException e) {
            azoj.m85931a("LWListenerImpl", e, "evaluateJavascriptParcel", new Object[0]);
        }
    }

    public azev(aztx aztx) {
        super("com.google.android.libraries.matchstick.net.ILighterWebListener");
        this.f99211a = aztx;
    }

    /* renamed from: a */
    public final void mo54853a(String str) {
        this.f99211a.mo54821a(str);
    }

    /* renamed from: a */
    public final void mo54854a(String[] strArr) {
        this.f99211a.mo54822a(strArr);
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            mo54854a(parcel.createStringArray());
        } else if (i == 2) {
            mo54853a(parcel.readString());
        } else if (i != 3) {
            return false;
        } else {
            mo54852a((ParcelFileDescriptor) dcl.m8163a(parcel, ParcelFileDescriptor.CREATOR));
        }
        return true;
    }
}
