package p000;

/* renamed from: awgg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awgg {

    /* renamed from: a */
    public boolean f94298a = false;

    /* renamed from: b */
    private final StringBuilder f94299b = new StringBuilder();

    /* renamed from: a */
    public final String mo52121a() {
        return this.f94299b.toString();
    }

    /* renamed from: a */
    public final void mo52122a(int i) {
        mo52123a(Integer.toString(i));
    }

    /* renamed from: a */
    public final void mo52123a(String str) {
        if (str != null) {
            StringBuilder sb = this.f94299b;
            sb.append("|");
            sb.append(str.length());
            sb.append("|");
            sb.append(str);
            return;
        }
        this.f94299b.append("||");
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo52124a(byte[] bArr) {
        sdo.m34971a(this.f94298a, (Object) "Assuming this byteArray is actually a serialized proto, it is not safe to assemble persistent storage keys containing serialized protos as their serialization could change overtime with changes to proto implementations.");
        mo52123a(sqd.m35968b(bArr));
    }
}
