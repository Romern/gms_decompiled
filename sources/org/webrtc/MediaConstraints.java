package org.webrtc;

import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MediaConstraints {

    /* renamed from: a */
    public final List f191841a = new ArrayList();

    /* renamed from: b */
    public final List f191842b = new ArrayList();

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class KeyValuePair {
        public final boolean equals(Object obj) {
            throw null;
        }

        public String getKey() {
            throw null;
        }

        public String getValue() {
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* renamed from: a */
    private static String m151182a(List list) {
        StringBuilder sb = new StringBuilder("[");
        if (list.size() > 0) {
            KeyValuePair keyValuePair = (KeyValuePair) list.get(0);
            if (sb.length() > 1) {
                sb.append(", ");
                throw null;
            }
            throw null;
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public List getMandatory() {
        return this.f191841a;
    }

    /* access modifiers changed from: package-private */
    public List getOptional() {
        return this.f191842b;
    }

    public final String toString() {
        String a = m151182a(this.f191841a);
        String a2 = m151182a(this.f191842b);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 23 + String.valueOf(a2).length());
        sb.append("mandatory: ");
        sb.append(a);
        sb.append(", optional: ");
        sb.append(a2);
        return sb.toString();
    }
}
