package p000;

import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;

/* renamed from: xya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xya implements Cloneable {

    /* renamed from: a */
    public String f53355a;

    /* renamed from: b */
    public String f53356b;

    /* renamed from: c */
    public String f53357c;

    /* renamed from: d */
    public ChannelIdValue f53358d;

    public xya() {
        this.f53358d = ChannelIdValue.f31891a;
    }

    /* renamed from: a */
    public static xya m43645a() {
        return new xya();
    }

    /* renamed from: b */
    public final xyb mo30246b() {
        return new xyb(this.f53355a, this.f53356b, this.f53357c, this.f53358d);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new xya(this.f53355a, this.f53356b, this.f53357c, this.f53358d);
    }

    public xya(String str, String str2, String str3, ChannelIdValue channelIdValue) {
        this.f53355a = str;
        this.f53356b = str2;
        this.f53357c = str3;
        this.f53358d = channelIdValue;
    }
}
