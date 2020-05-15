package p000;

import java.util.UUID;

/* renamed from: bcig */
final /* synthetic */ class bcig implements bmxj {

    /* renamed from: a */
    private final UUID f104207a;

    /* renamed from: b */
    private final bcnl f104208b;

    public bcig(UUID uuid, bcnl bcnl) {
        this.f104207a = uuid;
        this.f104208b = bcnl;
    }

    public final Object apply(Object obj) {
        UUID uuid = this.f104207a;
        bcnl bcnl = this.f104208b;
        String valueOf = String.valueOf(uuid);
        String simpleName = obj.getClass().getSimpleName();
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22 + String.valueOf(simpleName).length());
        sb.append("response(requestId=");
        sb.append(valueOf);
        sb.append("): ");
        sb.append(simpleName);
        bbos.m88291b("Backend", sb.toString());
        String valueOf2 = String.valueOf(uuid);
        String valueOf3 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 22 + String.valueOf(valueOf3).length());
        sb2.append("response(requestId=");
        sb2.append(valueOf2);
        sb2.append("): ");
        sb2.append(valueOf3);
        bbos.m88289a("Backend", sb2.toString());
        return bcnl.mo56980a(obj);
    }
}
