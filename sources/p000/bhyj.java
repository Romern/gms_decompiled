package p000;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bhyj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhyj extends bhsy {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo64249a(Object obj) {
        return ((bhyw) obj).mo64432a() + 4;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ int mo64252b(Object obj) {
        List<String> list = (List) obj;
        int i = 0;
        for (String str : list) {
            i += str.length();
        }
        if (!list.isEmpty()) {
            i += list.size() - 1;
        }
        return i + 4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo64250a(bxuc bxuc) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bxuc.mo73795e(bxuc.mo73799h()));
            int i = wrap.getInt();
            byte[] bArr = new byte[i];
            for (int i2 = 0; i2 < i; i2++) {
                bArr[i2] = wrap.get();
            }
            String str = new String(bArr, "UTF-8");
            int i3 = wrap.getInt();
            byte[] bArr2 = new byte[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                bArr2[i4] = wrap.get();
            }
            return bhyw.m101782a(str, new String(bArr2, "UTF-8"), Long.valueOf(wrap.getLong()));
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError("UTF-8 is unknown");
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo64253b(bxuc bxuc) {
        byte[] e = bxuc.mo73795e(bxuc.mo73799h());
        if (e.length == 0) {
            return Collections.emptyList();
        }
        try {
            return Arrays.asList(new String(e, "UTF-8").split("#"));
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError("UTF-8 is unknown");
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo64254b(Object obj, bxuk bxuk) {
        byte[] bArr;
        List<String> list = (List) obj;
        try {
            if (!list.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (String str : list) {
                    sb.append(str);
                    sb.append('#');
                }
                sb.deleteCharAt(sb.length() - 1);
                bArr = sb.toString().getBytes("UTF-8");
            } else {
                bArr = new byte[0];
            }
            bxuk.mo73858e(bArr.length);
            bxuk.mo73865b(bArr);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError("UTF-8 is unknown");
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64251a(Object obj, bxuk bxuk) {
        bhyw bhyw = (bhyw) obj;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(bhyw.mo64432a());
            allocate.putInt(bhyw.f119919a.length());
            allocate.put(bhyw.f119919a.getBytes("UTF-8"));
            allocate.putInt(bhyw.f119920b.length());
            allocate.put(bhyw.f119920b.getBytes("UTF-8"));
            allocate.putLong(bhyw.f119921c);
            byte[] array = allocate.array();
            bxuk.mo73858e(array.length);
            bxuk.mo73865b(array);
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError("UTF-8 is unknown");
        }
    }
}
