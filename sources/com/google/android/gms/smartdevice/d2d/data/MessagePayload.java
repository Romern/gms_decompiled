package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.EsimActivationPayload;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MessagePayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new arhk();

    /* renamed from: o */
    private static final HashMap f107973o;

    /* renamed from: a */
    public final Set f107974a;

    /* renamed from: b */
    public final int f107975b;

    /* renamed from: c */
    public int f107976c;

    /* renamed from: d */
    public BootstrapOptions f107977d;

    /* renamed from: e */
    public BootstrapConfigurations f107978e;

    /* renamed from: f */
    public DisplayText f107979f;

    /* renamed from: g */
    public AccountBootstrapPayload f107980g;

    /* renamed from: h */
    public ProgressEvent f107981h;

    /* renamed from: i */
    public boolean f107982i;

    /* renamed from: j */
    public ArrayList f107983j;

    /* renamed from: k */
    public AccountTransferPayload f107984k;

    /* renamed from: l */
    public DeviceStatus f107985l;

    /* renamed from: m */
    public WorkProfilePayload f107986m;

    /* renamed from: n */
    public ArrayList f107987n;

    /* renamed from: p */
    private int f107988p;

    /* renamed from: q */
    private boolean f107989q;

    /* renamed from: r */
    private boolean f107990r;

    static {
        HashMap hashMap = new HashMap();
        f107973o = hashMap;
        hashMap.put("protocolVersion", FastJsonResponse$Field.m22651a("protocolVersion", 7));
        f107973o.put("bootstrapState", FastJsonResponse$Field.m22651a("bootstrapState", 2));
        f107973o.put("bootstrapOptions", FastJsonResponse$Field.m22653a("bootstrapOptions", 3, BootstrapOptions.class));
        f107973o.put("bootstrapConfigurations", FastJsonResponse$Field.m22653a("bootstrapConfigurations", 4, BootstrapConfigurations.class));
        f107973o.put("displayText", FastJsonResponse$Field.m22653a("displayText", 5, DisplayText.class));
        f107973o.put("accountBootstrapPayload", FastJsonResponse$Field.m22653a("accountBootstrapPayload", 6, AccountBootstrapPayload.class));
        f107973o.put("progressEvent", FastJsonResponse$Field.m22653a("progressEvent", 8, ProgressEvent.class));
        f107973o.put("priorityMessage", FastJsonResponse$Field.m22664e("priorityMessage", 9));
        f107973o.put("accountTransferResults", FastJsonResponse$Field.m22657b("accountTransferResults", 10, AccountTransferResult.class));
        f107973o.put("accountTransferMsg", FastJsonResponse$Field.m22653a("accountTransferMsg", 11, AccountTransferPayload.class));
        f107973o.put("deviceStatus", FastJsonResponse$Field.m22653a("deviceStatus", 12, DeviceStatus.class));
        f107973o.put("workProfilePayload", FastJsonResponse$Field.m22653a("workProfilePayload", 13, WorkProfilePayload.class));
        f107973o.put("esimActivationPayloads", FastJsonResponse$Field.m22657b("esimActivationPayloads", 14, EsimActivationPayload.class));
    }

    public MessagePayload() {
        this.f107976c = 0;
        this.f107989q = false;
        this.f107990r = false;
        this.f107975b = 3;
        HashSet hashSet = new HashSet();
        this.f107974a = hashSet;
        this.f107988p = 3;
        hashSet.add(7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Map mo7367a() {
        return f107973o;
    }

    /* renamed from: b */
    public final int mo59101b() {
        if (!this.f107989q || this.f107990r) {
            return this.f107988p;
        }
        return 0;
    }

    /* renamed from: c */
    public final String mo59103c() {
        StringBuilder sb = new StringBuilder();
        sb.append("MessagePayload[bootstrapState=");
        sb.append(this.f107976c);
        if (this.f107977d != null) {
            sb.append(" bootstrapOptions=ELIDED");
        }
        if (this.f107978e != null) {
            sb.append(" bootstrapConfigurations=ELIDED");
        }
        if (this.f107979f != null) {
            sb.append(" displayText=\"");
            sb.append(this.f107979f);
            sb.append("\"");
        }
        if (this.f107980g != null) {
            sb.append(" accountBootstrapPayload=ELIDED");
        }
        if (this.f107981h != null) {
            sb.append(" progressEvent=");
            sb.append(this.f107981h);
        }
        if (this.f107984k != null) {
            sb.append(" accountTransferPayload=ELIDED");
        }
        if (this.f107983j != null) {
            sb.append(" accountTransferResults=ELIDED");
        }
        if (this.f107985l != null) {
            sb.append(" deviceStatus=");
            sb.append(this.f107985l);
        }
        if (this.f107986m != null) {
            sb.append(" workProfilePayload=ELIDED");
        }
        if (this.f107987n != null) {
            sb.append(" esimActivationPayloads=ELIDED");
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: e */
    public final void mo59104e(String str) {
        this.f107979f = new DisplayText(str);
        this.f107974a.add(5);
    }

    /* renamed from: a */
    public final void mo59093a(int i) {
        this.f107976c = i;
        this.f107974a.add(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Object mo7371b(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 1:
                return Integer.valueOf(this.f107975b);
            case 2:
                return Integer.valueOf(this.f107976c);
            case 3:
                return this.f107977d;
            case 4:
                return this.f107978e;
            case 5:
                return this.f107979f;
            case 6:
                return this.f107980g;
            case 7:
                return Integer.valueOf(mo59101b());
            case 8:
                return this.f107981h;
            case 9:
                return Boolean.valueOf(this.f107982i);
            case 10:
                return this.f107983j;
            case 11:
                return this.f107984k;
            case 12:
                return this.f107985l;
            case 13:
                return this.f107986m;
            case 14:
                return this.f107987n;
            default:
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = see.m35030a(parcel);
        Set set = this.f107974a;
        if (set.contains(1)) {
            see.m35063b(parcel, 1, this.f107975b);
        }
        if (set.contains(2)) {
            see.m35063b(parcel, 2, this.f107976c);
        }
        if (set.contains(3)) {
            see.m35040a(parcel, 3, this.f107977d, i, true);
        }
        if (set.contains(4)) {
            see.m35040a(parcel, 4, this.f107978e, i, true);
        }
        if (set.contains(5)) {
            see.m35040a(parcel, 5, this.f107979f, i, true);
        }
        if (set.contains(6)) {
            see.m35040a(parcel, 6, this.f107980g, i, true);
        }
        if (set.contains(7)) {
            see.m35063b(parcel, 7, mo59101b());
        }
        if (set.contains(8)) {
            see.m35040a(parcel, 8, this.f107981h, i, true);
        }
        if (set.contains(9)) {
            see.m35051a(parcel, 9, this.f107982i);
        }
        if (set.contains(10)) {
            see.m35066c(parcel, 10, this.f107983j, true);
        }
        if (set.contains(11)) {
            see.m35040a(parcel, 11, this.f107984k, i, true);
        }
        if (set.contains(12)) {
            see.m35040a(parcel, 12, this.f107985l, i, true);
        }
        if (set.contains(13)) {
            see.m35040a(parcel, 13, this.f107986m, i, true);
        }
        if (set.contains(14)) {
            see.m35066c(parcel, 14, this.f107987n, true);
        }
        see.m35062b(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7391a(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        this.f107989q = true;
        int i2 = fastJsonResponse$Field.f30319g;
        if (i2 == 2) {
            this.f107976c = i;
        } else if (i2 == 7) {
            this.f107988p = i;
            this.f107990r = true;
        } else {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Field with id=");
            sb.append(i2);
            sb.append(" is not known to be an int.");
            throw new IllegalArgumentException(sb.toString());
        }
        this.f107974a.add(Integer.valueOf(i2));
    }

    public MessagePayload(Set set, int i, int i2, int i3, BootstrapOptions bootstrapOptions, BootstrapConfigurations bootstrapConfigurations, DisplayText displayText, AccountBootstrapPayload accountBootstrapPayload, ProgressEvent progressEvent, boolean z, ArrayList arrayList, AccountTransferPayload accountTransferPayload, DeviceStatus deviceStatus, WorkProfilePayload workProfilePayload, ArrayList arrayList2) {
        this.f107989q = false;
        this.f107990r = false;
        this.f107974a = set;
        this.f107975b = i;
        this.f107988p = i2;
        this.f107976c = i3;
        this.f107977d = bootstrapOptions;
        this.f107978e = bootstrapConfigurations;
        this.f107979f = displayText;
        this.f107980g = accountBootstrapPayload;
        this.f107981h = progressEvent;
        this.f107982i = z;
        this.f107983j = arrayList;
        this.f107984k = accountTransferPayload;
        this.f107985l = deviceStatus;
        this.f107986m = workProfilePayload;
        this.f107987n = arrayList2;
    }

    /* renamed from: a */
    public final void mo7368a(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 10) {
            this.f107983j = arrayList;
        } else if (i == 14) {
            this.f107987n = arrayList;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(i), arrayList.getClass().getCanonicalName()));
        }
        this.f107974a.add(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo59102b(ArrayList arrayList) {
        this.f107987n = arrayList;
        this.f107974a.add(14);
    }

    /* renamed from: a */
    public final void mo7369a(FastJsonResponse$Field fastJsonResponse$Field, String str, sio sio) {
        this.f107989q = true;
        int i = fastJsonResponse$Field.f30319g;
        switch (i) {
            case 3:
                this.f107977d = (BootstrapOptions) sio;
                break;
            case 4:
                this.f107978e = (BootstrapConfigurations) sio;
                break;
            case 5:
                this.f107979f = (DisplayText) sio;
                break;
            case 6:
                this.f107980g = (AccountBootstrapPayload) sio;
                break;
            case 7:
            case 9:
            case 10:
            default:
                throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), sio.getClass().getCanonicalName()));
            case 8:
                this.f107981h = (ProgressEvent) sio;
                break;
            case 11:
                this.f107984k = (AccountTransferPayload) sio;
                break;
            case 12:
                this.f107985l = (DeviceStatus) sio;
                break;
            case 13:
                this.f107986m = (WorkProfilePayload) sio;
                break;
        }
        this.f107974a.add(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7395a(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.f30319g;
        if (i == 9) {
            this.f107982i = z;
            this.f107974a.add(Integer.valueOf(i));
            return;
        }
        StringBuilder sb = new StringBuilder(55);
        sb.append("Field with id=");
        sb.append(i);
        sb.append(" is not known to be a boolean.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo59094a(BootstrapConfigurations bootstrapConfigurations) {
        this.f107978e = bootstrapConfigurations;
        this.f107974a.add(4);
    }

    /* renamed from: a */
    public final void mo59095a(BootstrapOptions bootstrapOptions) {
        this.f107977d = bootstrapOptions;
        this.f107974a.add(3);
    }

    /* renamed from: a */
    public final void mo59096a(AccountBootstrapPayload accountBootstrapPayload) {
        this.f107980g = accountBootstrapPayload;
        this.f107974a.add(6);
    }

    /* renamed from: a */
    public final void mo59097a(AccountTransferPayload accountTransferPayload) {
        this.f107984k = accountTransferPayload;
        this.f107974a.add(11);
    }

    /* renamed from: a */
    public final void mo59098a(DeviceStatus deviceStatus) {
        this.f107985l = deviceStatus;
        this.f107974a.add(12);
    }

    /* renamed from: a */
    public final void mo59099a(WorkProfilePayload workProfilePayload) {
        this.f107986m = workProfilePayload;
        this.f107974a.add(13);
    }

    /* renamed from: a */
    public final void mo59100a(ArrayList arrayList) {
        this.f107983j = arrayList;
        this.f107974a.add(10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7370a(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.f107974a.contains(Integer.valueOf(fastJsonResponse$Field.f30319g));
    }
}
