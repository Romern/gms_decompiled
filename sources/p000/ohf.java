package p000;

import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.util.ArrayList;

/* renamed from: ohf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ohf extends okj {

    /* renamed from: a */
    public static final bnsn f37630a = odk.m28481a("CAR.GAL.GAL");

    /* renamed from: b */
    public final ArrayList f37631b = new ArrayList();

    /* renamed from: c */
    private Handler f37632c;

    public ohf(oho oho, ogo ogo, Bundle bundle) {
        super(oho, ogo);
        if (bundle.containsKey("writer_message_queue_state")) {
            ArrayList arrayList = this.f37631b;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("writer_message_queue_state");
            bmxy.m108581a(parcelableArrayList);
            arrayList.addAll(parcelableArrayList);
        }
    }

    /* renamed from: a */
    public final void mo22152a(Bundle bundle) {
        bundle.putParcelableArrayList("writer_message_queue_state", new ArrayList(this.f37631b));
    }

    /* renamed from: a */
    public final void mo22153a(ChannelMessage channelMessage) {
        if (this.f37632c == null) {
            this.f37632c = new ohe(this, getLooper());
            if (!this.f37631b.isEmpty()) {
                this.f37632c.sendEmptyMessage(2);
            }
        }
        Handler handler = this.f37632c;
        if (!handler.sendMessage(handler.obtainMessage(1, channelMessage))) {
            bnsi c = f37630a.mo68388c();
            c.mo68437a(new Exception("Late message"));
            c.mo68432a("ohf", "a", 63, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68405a("Message received after stopping");
        }
    }
}
