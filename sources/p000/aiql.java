package p000;

import java.nio.ByteBuffer;

/* renamed from: aiql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiql {
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void
     arg types: [java.lang.String, int, int, java.lang.Integer]
     candidates:
      bnsi.a(java.lang.String, java.lang.String, int, java.lang.String):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object):void */
    /* renamed from: a */
    public static byte[] m57730a(byte[] bArr) {
        int length = bArr.length;
        if (length >= 3 && length <= 14) {
            ByteBuffer allocate = ByteBuffer.allocate(length + 1);
            allocate.put((byte) ((length + length) & 30));
            allocate.put(bArr);
            return allocate.array();
        }
        bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
        bnsl.mo68432a("aiql", "a", 53, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68425a("Out of range modelId. Expected between %d and %d but got %d instead.", (Object) 3, (Object) 14, (Object) Integer.valueOf(length));
        return null;
    }
}
