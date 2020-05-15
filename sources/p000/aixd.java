package p000;

import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.ble.BleFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aixd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aixd {

    /* renamed from: a */
    public boolean f69972a;

    /* renamed from: b */
    private final Set f69973b = new HashSet();

    /* renamed from: c */
    private final List f69974c = new ArrayList();

    /* renamed from: d */
    private final Set f69975d = new HashSet();

    /* renamed from: b */
    private final void m58103b(String str, String str2) {
        this.f69973b.add(new MessageType(str, str2));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final MessageFilter mo38199a() {
        boolean z = true;
        if (!this.f69972a && this.f69973b.isEmpty()) {
            z = false;
        }
        sdo.m34971a(z, (Object) "At least one of the include methods must be called.");
        return new MessageFilter(2, new ArrayList(this.f69973b), this.f69974c, this.f69972a, new ArrayList(this.f69975d), 0);
    }

    /* renamed from: a */
    public final void mo38200a(BleFilter bleFilter) {
        m58103b("__reserved_namespace", "__ble_record");
        this.f69975d.add(bleFilter);
    }

    /* renamed from: a */
    public final void mo38201a(String str, String str2) {
        boolean z;
        boolean z2;
        if (str == null || str.isEmpty() || str.contains("*")) {
            z = false;
        } else {
            z = true;
        }
        sdo.m34976b(z, "namespace(%s) cannot be null, empty or contain (*).", str);
        if (str2 == null || str2.contains("*")) {
            z2 = false;
        } else {
            z2 = true;
        }
        sdo.m34976b(z2, "type(%s) cannot be null or contain (*).", str2);
        m58103b(str, str2);
    }
}
