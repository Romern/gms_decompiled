package p000;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.location.RemoveGeofencingRequest;

/* renamed from: bgae */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgae extends bfyv {

    /* renamed from: a */
    final int f115863a;

    /* renamed from: b */
    final String f115864b;

    /* renamed from: c */
    final RemoveGeofencingRequest f115865c;

    /* renamed from: e */
    public final bgad f115866e;

    public bgae(int i, String str, bgad bgad, RemoveGeofencingRequest removeGeofencingRequest) {
        super(5);
        this.f115863a = i;
        this.f115864b = str;
        this.f115865c = removeGeofencingRequest;
        this.f115866e = bgad;
    }

    /* renamed from: a */
    public static bgae m98381a(String str, bgad bgad) {
        return new bgae(1, str, bgad, null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemoveGeofencingRequest[");
        int i = this.f115863a;
        if (i == 1) {
            sb.append("REMOVE_ALL ");
        } else if (i != 2) {
            sb.append("REMOVE_BY_PENDING_INTENT pendingIntent=PendingIntent[creatorPackage=");
            sb.append(bhcb.m100621a(this.f115865c.f79379b));
            sb.append("], ");
        } else {
            sb.append("REMOVE_BY_IDS Ids=[");
            for (String str : this.f115865c.f79378a) {
                sb.append(str.replaceAll("\\p{C}", "?"));
                sb.append(", ");
            }
            sb.setLength(sb.length() - 2);
            sb.append("], ");
        }
        sb.append("packageName=");
        sb.append(this.f115864b);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62422a() {
        int intValue = ((Integer) mo62450b()).intValue();
        bgad bgad = this.f115866e;
        if (bgad != null) {
            int i = this.f115863a;
            if (i == 1) {
                throw new UnsupportedOperationException("onRemoveAllGeofences not implemented in remote side.");
            } else if (i != 2) {
                PendingIntent pendingIntent = this.f115865c.f79379b;
                aejy aejy = bgad.f115862a;
                if (aejy != null) {
                    try {
                        aejy.mo34203a(intValue, pendingIntent);
                    } catch (RemoteException e) {
                    }
                }
            } else {
                String[] strArr = (String[]) this.f115865c.f79378a.toArray(new String[this.f115865c.f79378a.size()]);
                aejy aejy2 = this.f115866e.f115862a;
                if (aejy2 != null) {
                    try {
                        aejy2.mo34205b(intValue, strArr);
                    } catch (RemoteException e2) {
                    }
                }
            }
        }
    }
}
