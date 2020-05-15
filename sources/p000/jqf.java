package p000;

import android.app.PendingIntent;
import com.google.android.gms.auth.proximity.RemoteDevice;
import com.google.android.gms.auth.proximity.Role;
import com.google.android.gms.auth.proximity.firstparty.SecureChannelSubscription;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jqf {

    /* renamed from: a */
    public PendingIntent f23046a;

    /* renamed from: b */
    public String f23047b;

    /* renamed from: c */
    public Role f23048c;

    /* renamed from: d */
    private final List f23049d = new ArrayList();

    /* renamed from: a */
    public final SecureChannelSubscription mo13989a() {
        ArrayList arrayList = new ArrayList();
        List list = this.f23049d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            RemoteDevice remoteDevice = (RemoteDevice) list.get(i);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("n", remoteDevice.f11139c);
                jSONObject.put("t", remoteDevice.f11144h);
                jSONObject.put("i", remoteDevice.f11138b);
                jSONObject.put("a", remoteDevice.f11140d);
                arrayList.add(jSONObject.toString());
            } catch (JSONException e) {
            }
        }
        PendingIntent pendingIntent = this.f23046a;
        Role role = this.f23048c;
        return new SecureChannelSubscription(pendingIntent, role.f11146b, role.f11147c, arrayList, this.f23047b);
    }

    /* renamed from: a */
    public final void mo13990a(List list) {
        this.f23049d.clear();
        this.f23049d.addAll(list);
    }
}
