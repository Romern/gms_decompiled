package p000;

import java.nio.ByteBuffer;

/* renamed from: bhyk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhyk extends bhsy {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo64249a(Object obj) {
        return ((String) obj).length() + 4;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ int mo64252b(Object obj) {
        bhzl bhzl = (bhzl) obj;
        return 24;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo64253b(bxuc bxuc) {
        ByteBuffer wrap = ByteBuffer.wrap(bxuc.mo73795e(bxuc.mo73799h()));
        return bhzl.m101798a(wrap.getDouble(), wrap.getDouble(), wrap.getFloat());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo64250a(bxuc bxuc) {
        return new String(bxuc.mo73795e(bxuc.mo73799h()), "UTF-8");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64251a(Object obj, bxuk bxuk) {
        byte[] bytes = ((String) obj).getBytes("UTF-8");
        bxuk.mo73858e(bytes.length);
        bxuk.mo73865b(bytes);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo64254b(Object obj, bxuk bxuk) {
        bhzl bhzl = (bhzl) obj;
        ByteBuffer allocate = ByteBuffer.allocate(20);
        allocate.putDouble(bhzl.f119959a);
        allocate.putDouble(bhzl.f119960b);
        allocate.putFloat(bhzl.f119961c);
        byte[] array = allocate.array();
        bxuk.mo73858e(array.length);
        bxuk.mo73865b(array);
    }
}
