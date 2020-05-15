package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import com.google.android.gms.mdns.MdnsOptions;
import com.google.android.gms.mdns.MdnsSearchOptions;
import java.util.concurrent.ExecutionException;

/* renamed from: aiow */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aiow extends airo {

    /* renamed from: a */
    private final Context f69381a;

    /* renamed from: b */
    private final ConnectivityManager f69382b;

    /* renamed from: c */
    private final aiou f69383c;

    /* renamed from: d */
    private final String f69384d;

    /* renamed from: e */
    private agba f69385e;

    public aiow(Context context, ConnectivityManager connectivityManager, aiou aiou, String str) {
        super(42);
        this.f69381a = context;
        this.f69382b = connectivityManager;
        this.f69383c = aiou;
        this.f69384d = str;
    }

    /* renamed from: a */
    public final void mo37566a() {
        agba agba = this.f69385e;
        if (agba != null) {
            agba.mo35179a((agbb) this.f69383c);
            this.f69385e = null;
            return;
        }
        srn srn = ailf.f69111a;
    }

    /* renamed from: b */
    public final int mo37568b() {
        if (aiox.m57587a(this.f69382b)) {
            int i = Build.VERSION.SDK_INT;
            if (aiox.m57588c()) {
                agba a = agai.m53800a(this.f69381a, MdnsOptions.m67242a(aiox.m57589h(this.f69384d), "NearbyConnections").mo35140a());
                aiou aiou = this.f69383c;
                agav a2 = MdnsSearchOptions.m67243a();
                a2.f65105a = false;
                try {
                    aucu.m76782a(a.mo35178a(aiou, a2.mo35174a()));
                    this.f69385e = a;
                    bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                    bnsl.mo68432a("aiow", "b", 1041, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68420a("Successfully started Wifi LAN discovery for serviceID %s.", this.f69384d);
                    return 2;
                } catch (InterruptedException | ExecutionException e) {
                    bnsl bnsl2 = (bnsl) ailf.f69111a.mo68388c();
                    bnsl2.mo68437a(e);
                    bnsl2.mo68432a("aiow", "b", 1044, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl2.mo68405a("Failed to start Wifi LAN discovery");
                    return 4;
                }
            } else {
                bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                bnsl3.mo68432a("aiow", "b", 1024, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("Can't discover over the local area network because mDNS isn't available.");
                return 4;
            }
        } else {
            bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
            bnsl4.mo68432a("aiow", "b", 1018, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl4.mo68405a("Can't discover over the local area network because we're not connected over Wifi.");
            return 4;
        }
    }
}
