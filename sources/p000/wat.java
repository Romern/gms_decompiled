package p000;

import android.os.IInterface;

/* renamed from: wat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface wat extends IInterface {
    vzr createModuleContext(vzr vzr, String str, int i);

    vzr createModuleContextNoCrashUtils(vzr vzr, String str, int i);

    int getIDynamiteLoaderVersion();

    int getModuleVersion(vzr vzr, String str);

    int getModuleVersion2(vzr vzr, String str, boolean z);

    int getModuleVersion2NoCrashUtils(vzr vzr, String str, boolean z);
}
