package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: chtc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class chtc implements Iterable {
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("cifw"));
        } catch (ClassNotFoundException e) {
        }
        try {
            arrayList.add(Class.forName("io.grpc.netty.NettyChannelProvider"));
        } catch (ClassNotFoundException e2) {
        }
        return arrayList.iterator();
    }
}
