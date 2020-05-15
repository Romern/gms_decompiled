package p000;

import java.util.Stack;

/* renamed from: nvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nvi extends Stack {
    public final synchronized void addElement(Object obj) {
        remove(obj);
        super.addElement(obj);
    }
}
