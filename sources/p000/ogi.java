package p000;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.gms.car.senderprotocol.Channel$FlattenedChannel;

/* renamed from: ogi */
final /* synthetic */ class ogi implements bmxj {

    /* renamed from: a */
    private final Bundle f37555a;

    /* renamed from: b */
    private final SparseArray f37556b;

    public ogi(Bundle bundle, SparseArray sparseArray) {
        this.f37555a = bundle;
        this.f37556b = sparseArray;
    }

    public final Object apply(Object obj) {
        Bundle bundle = this.f37555a;
        SparseArray sparseArray = this.f37556b;
        ogs ogs = (ogs) obj;
        bnsn bnsn = ogs.f37577a;
        Channel$FlattenedChannel[] channel$FlattenedChannelArr = (Channel$FlattenedChannel[]) bundle.getParcelableArray("channels");
        int i = 0;
        while (true) {
            int length = ogs.f37579c.length;
            if (i >= 256) {
                return null;
            }
            if (i == 0) {
                ogs.f37597u.put(Integer.valueOf(channel$FlattenedChannelArr[0].mo17384a()), ogs.f37590n);
                ogs.f37579c[0] = new oga(channel$FlattenedChannelArr[0], ogs, ogs.mo22125a(channel$FlattenedChannelArr[0].mo17384a()), ogs.f37583g, ogs.f37590n);
                ogs.f37584h.mo22210a(ogs.f37579c[0]);
                ogs.mo22129a(0, ohr.m28776a(oer.CONTROL));
            } else {
                Channel$FlattenedChannel channel$FlattenedChannel = channel$FlattenedChannelArr[i];
                if (channel$FlattenedChannel != null) {
                    ojh ojh = (ojh) sparseArray.get(channel$FlattenedChannel.mo17384a());
                    ogs.f37579c[i] = new oga(channel$FlattenedChannelArr[i], ogs, ogs.mo22125a(channel$FlattenedChannelArr[i].mo17384a()), ojh, ogs.mo22131b(ojh.f37754o));
                    ((ojh) sparseArray.get(ogs.f37579c[i].f37531b)).mo22210a(ogs.f37579c[i]);
                    oer a = oer.m28607a(ojh.f37753n);
                    bmxy.m108581a(a);
                    ogs.mo22129a(ogs.f37579c[i].f37531b, ohr.m28776a(a));
                }
            }
            i++;
        }
    }
}
