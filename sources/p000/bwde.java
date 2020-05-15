package p000;

import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: bwde */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bwde {

    /* renamed from: a */
    public DataInputStream f158886a;

    /* renamed from: b */
    public bwcf f158887b;

    public bwde(DataInputStream dataInputStream) {
        this.f158886a = dataInputStream;
        if (dataInputStream.readUnsignedShort() != 2) {
            throw new IOException("Unrecognised protocol version");
        }
    }
}
