package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.trustagent.common.service.PreferenceChimeraService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: auoa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auoa extends dck implements auob {

    /* renamed from: a */
    final /* synthetic */ PreferenceChimeraService f92184a;

    public auoa() {
        super("com.google.android.gms.trustagent.common.service.IPreferenceService");
    }

    /* renamed from: a */
    public final Bundle mo50713a(String str) {
        Map<String, ?> all = this.f92184a.f109154b.getAll();
        Bundle bundle = new Bundle();
        for (String str2 : all.keySet()) {
            if (str.isEmpty() || str2.startsWith(str)) {
                Object obj = all.get(str2);
                if (obj instanceof String) {
                    bundle.putString(str2, (String) obj);
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    bundle.putInt(str2, ((Integer) obj).intValue());
                } else if (obj instanceof Set) {
                    bundle.putStringArrayList(str2, new ArrayList((Set) obj));
                } else if (obj instanceof Long) {
                    bundle.putLong(str2, ((Long) obj).longValue());
                } else {
                    String valueOf = String.valueOf(obj.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(valueOf).length());
                    sb.append("Unsupported type in SharedPreference for key ");
                    sb.append(str2);
                    sb.append(" type ");
                    sb.append(valueOf);
                    sb.append(", ignored.");
                    Log.e("Coffee-PreferenceService", sb.toString());
                }
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public final void mo50719b(String str) {
        this.f92184a.f109154b.edit().remove(str).apply();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public auoa(PreferenceChimeraService preferenceChimeraService) {
        super("com.google.android.gms.trustagent.common.service.IPreferenceService");
        this.f92184a = preferenceChimeraService;
    }

    /* renamed from: a */
    public final void mo50714a(String str, int i) {
        this.f92184a.f109154b.edit().putInt(str, i).apply();
    }

    /* renamed from: a */
    public final void mo50715a(String str, long j) {
        this.f92184a.f109154b.edit().putLong(str, j).apply();
    }

    /* renamed from: a */
    public final void mo50716a(String str, String str2) {
        this.f92184a.f109154b.edit().putString(str, str2).apply();
    }

    /* renamed from: a */
    public final void mo50717a(String str, List list) {
        this.f92184a.f109154b.edit().putStringSet(str, new HashSet(list)).apply();
    }

    /* renamed from: a */
    public final void mo50718a(String str, boolean z) {
        this.f92184a.f109154b.edit().putBoolean(str, z).apply();
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Bundle a = mo50713a(parcel.readString());
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                return true;
            case 2:
                mo50718a(parcel.readString(), dcl.m8167a(parcel));
                parcel2.writeNoException();
                return true;
            case 3:
                mo50716a(parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                mo50714a(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 5:
                mo50715a(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 6:
                mo50717a(parcel.readString(), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 7:
                mo50719b(parcel.readString());
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
