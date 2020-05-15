package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AccountTransferProgress extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new gtu();

    /* renamed from: g */
    private static final C1223np f10045g;

    /* renamed from: a */
    final int f10046a;

    /* renamed from: b */
    public List f10047b;

    /* renamed from: c */
    public List f10048c;

    /* renamed from: d */
    public List f10049d;

    /* renamed from: e */
    public List f10050e;

    /* renamed from: f */
    public List f10051f;

    static {
        C1223np npVar = new C1223np();
        f10045g = npVar;
        npVar.put("registered", FastJsonResponse$Field.m22668g("registered", 2));
        f10045g.put("in_progress", FastJsonResponse$Field.m22668g("in_progress", 3));
        f10045g.put("success", FastJsonResponse$Field.m22668g("success", 4));
        f10045g.put("failed", FastJsonResponse$Field.m22668g("failed", 5));
        f10045g.put("escrowed", FastJsonResponse$Field.m22668g("escrowed", 6));
    }

    public AccountTransferProgress() {
        this.f10046a = 1;
    }

    /* renamed from: a */
    public static String m6324a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return "in_progress";
            case 5:
                return "success";
            case 6:
                return "failed";
            default:
                StringBuilder sb = new StringBuilder(26);
                sb.append("Invalid status:");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final Map mo7367a() {
        return f10045g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 1:
                return Integer.valueOf(this.f10046a);
            case 2:
                return this.f10047b;
            case 3:
                return this.f10048c;
            case 4:
                return this.f10049d;
            case 5:
                return this.f10050e;
            case 6:
                return this.f10051f;
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    public AccountTransferProgress(int i, List list, List list2, List list3, List list4, List list5) {
        this.f10046a = i;
        this.f10047b = list;
        this.f10048c = list2;
        this.f10049d = list3;
        this.f10050e = list4;
        this.f10051f = list5;
    }

    /* renamed from: a */
    private static final void m6325a(Map map, List list, String str) {
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                map.put((String) list.get(i), str);
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        see.m35063b(parcel, 1, this.f10046a);
        see.m35065b(parcel, 2, this.f10047b, false);
        see.m35065b(parcel, 3, this.f10048c, false);
        see.m35065b(parcel, 4, this.f10049d, false);
        see.m35065b(parcel, 5, this.f10050e, false);
        see.m35065b(parcel, 6, this.f10051f, false);
        see.m35062b(parcel, a);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public AccountTransferProgress(Map map) {
        char c;
        this.f10046a = 1;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getValue();
                switch (str.hashCode()) {
                    case -1869930878:
                        if (str.equals("registered")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1867169789:
                        if (str.equals("success")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1281977283:
                        if (str.equals("failed")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -753541113:
                        if (str.equals("in_progress")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1856884644:
                        if (str.equals("escrowed")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    if (this.f10047b == null) {
                        this.f10047b = new ArrayList();
                    }
                    this.f10047b.add((String) entry.getKey());
                } else if (c == 1) {
                    if (this.f10048c == null) {
                        this.f10048c = new ArrayList();
                    }
                    this.f10048c.add((String) entry.getKey());
                } else if (c == 2) {
                    if (this.f10049d == null) {
                        this.f10049d = new ArrayList();
                    }
                    this.f10049d.add((String) entry.getKey());
                } else if (c == 3) {
                    if (this.f10050e == null) {
                        this.f10050e = new ArrayList();
                    }
                    this.f10050e.add((String) entry.getKey());
                } else if (c != 4) {
                    String valueOf = String.valueOf((String) entry.getValue());
                    throw new IllegalArgumentException(valueOf.length() == 0 ? new String("Invalid ProgressStatus:") : "Invalid ProgressStatus:".concat(valueOf));
                } else {
                    if (this.f10051f == null) {
                        this.f10051f = new ArrayList();
                    }
                    this.f10051f.add((String) entry.getKey());
                }
            }
        }
    }

    /* renamed from: b */
    public final Map mo7386b() {
        C1223np npVar = new C1223np();
        m6325a(npVar, this.f10047b, "registered");
        m6325a(npVar, this.f10048c, "in_progress");
        m6325a(npVar, this.f10049d, "success");
        m6325a(npVar, this.f10050e, "failed");
        m6325a(npVar, this.f10051f, "escrowed");
        return npVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7387b(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 2) {
            this.f10047b = arrayList;
        } else if (i == 3) {
            this.f10048c = arrayList;
        } else if (i == 4) {
            this.f10049d = arrayList;
        } else if (i == 5) {
            this.f10050e = arrayList;
        } else if (i == 6) {
            this.f10051f = arrayList;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", Integer.valueOf(i)));
        }
    }
}
