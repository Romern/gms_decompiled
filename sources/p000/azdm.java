package p000;

import android.content.Context;

/* renamed from: azdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azdm {

    /* renamed from: e */
    public static final String f99090e;

    /* renamed from: f */
    public static final String f99091f;

    /* renamed from: a */
    public final azcl f99092a;

    /* renamed from: b */
    public final Context f99093b;

    /* renamed from: c */
    public final azan f99094c;

    /* renamed from: d */
    public final azdl f99095d = azdl.m85412a(this.f99093b);

    static {
        String a = azcl.m85290a("profile", "entity_type");
        String a2 = azcl.m85290a("messages", "_id");
        String a3 = azcl.m85290a("messages", "sender_profile_id");
        String a4 = azcl.m85290a("profile", "_id");
        int length = String.valueOf(a).length();
        int length2 = String.valueOf(a2).length();
        StringBuilder sb = new StringBuilder(length + 97 + length2 + String.valueOf(a3).length() + String.valueOf(a4).length());
        sb.append("DELETE FROM profile WHERE (");
        sb.append(a);
        sb.append(" NOT IN (2,6,3)) AND  NOT EXISTS (  SELECT ");
        sb.append(a2);
        sb.append(" FROM messages WHERE ");
        sb.append(a3);
        sb.append(" == ");
        sb.append(a4);
        sb.append(" )");
        f99090e = sb.toString();
        String a5 = azcl.m85290a("profile", "entity_type");
        String a6 = azcl.m85290a("conversations", "_id");
        String a7 = azcl.m85290a("conversations", "conversation_id");
        String a8 = azcl.m85290a("profile", "app_id");
        String a9 = azcl.m85290a("profile", "entity_type");
        String a10 = azcl.m85290a("profile", "entity_id");
        String a11 = azcl.m85290a("conversations", "conversation_id");
        String a12 = azcl.m85290a("profile", "app_id");
        String a13 = azcl.m85290a("profile", "entity_type");
        String a14 = azcl.m85290a("profile", "entity_id");
        StringBuilder sb2 = new StringBuilder(String.valueOf(a5).length() + 170 + String.valueOf(a6).length() + String.valueOf(a7).length() + String.valueOf(a8).length() + String.valueOf(a9).length() + String.valueOf(a10).length() + String.valueOf(a11).length() + String.valueOf(a12).length() + String.valueOf(a13).length() + String.valueOf(a14).length());
        sb2.append("DELETE FROM profile WHERE (");
        sb2.append(a5);
        sb2.append(" IN (2,6)) AND  NOT EXISTS (  SELECT ");
        sb2.append(a6);
        sb2.append(" FROM conversations WHERE ");
        sb2.append(a7);
        sb2.append(" like ");
        sb2.append(a8);
        sb2.append(" || \":2:\" || ");
        sb2.append(a9);
        sb2.append(" || \":\" || ");
        sb2.append(a10);
        sb2.append(" || \"%\" OR ");
        sb2.append(a11);
        sb2.append(" like ");
        sb2.append(a12);
        sb2.append(" || \":4:\" || ");
        sb2.append(a13);
        sb2.append(" || \":\" || ");
        sb2.append(a14);
        sb2.append(" || \"%\" )");
        f99091f = sb2.toString();
    }

    public azdm(Context context, azcl azcl) {
        Context applicationContext = context.getApplicationContext();
        this.f99093b = applicationContext;
        this.f99092a = azcl;
        this.f99094c = azan.m85141a(applicationContext);
    }
}
