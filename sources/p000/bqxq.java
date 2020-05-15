package p000;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: bqxq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bqxq {
    protected bqxq() {
    }

    /* renamed from: a */
    static bqxq m113687a(ByteBuffer byteBuffer, bqxr bqxr) {
        ArrayList arrayList = new ArrayList();
        int i = byteBuffer.getInt();
        while (i != -1) {
            arrayList.add(new bqwq(i, byteBuffer.getInt(), byteBuffer.getInt(), bqxr));
            i = byteBuffer.getInt();
        }
        return m113688a(Collections.unmodifiableList(arrayList));
    }

    /* renamed from: a */
    public abstract List mo69383a();

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final byte[] mo69441b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bobm bobm = new bobm(byteArrayOutputStream);
        try {
            for (bqxp bqxp : mo69383a()) {
                ByteBuffer order = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN);
                order.putInt(bqxp.mo69377a());
                order.putInt(bqxp.mo69378b());
                order.putInt(bqxp.mo69379c());
                byte[] array = order.array();
                if (array.length == 12) {
                    bobm.write(array);
                } else {
                    throw new IllegalStateException("Encountered a span of invalid length.");
                }
            }
            bobm.writeInt(-1);
            boax.m111028a(bobm);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            boax.m111028a(bobm);
            throw th;
        }
    }

    public final String toString() {
        return String.format(Locale.US, "StringPoolStyle{spans=%s}", mo69383a());
    }

    /* renamed from: a */
    static bqxq m113688a(List list) {
        return new bqwr(list);
    }
}
