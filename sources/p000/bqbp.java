package p000;

/* renamed from: bqbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bqbp {
    /* renamed from: a */
    public static bxvd m112520a(Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        bxvd da = bpwl.f139521d.mo74144da();
        String name = th.getClass().getName();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bpwl bpwl = (bpwl) da.f164949b;
        name.getClass();
        bpwl.f139523a |= 1;
        bpwl.f139524b = name;
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (NullPointerException e) {
            stackTraceElementArr = null;
        }
        if (stackTraceElementArr != null) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                bxvd da2 = bpwk.f139513f.mo74144da();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpwk bpwk = (bpwk) da2.f164949b;
                    className.getClass();
                    bpwk.f139515a |= 1;
                    bpwk.f139516b = className;
                    String methodName = stackTraceElement.getMethodName();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpwk bpwk2 = (bpwk) da2.f164949b;
                    methodName.getClass();
                    bpwk2.f139515a |= 2;
                    bpwk2.f139517c = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bpwk bpwk3 = (bpwk) da2.f164949b;
                    bpwk3.f139515a |= 8;
                    bpwk3.f139519e = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        bpwk bpwk4 = (bpwk) da2.f164949b;
                        fileName.getClass();
                        bpwk4.f139515a |= 4;
                        bpwk4.f139518d = fileName;
                    }
                }
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpwl bpwl2 = (bpwl) da.f164949b;
                bpwk bpwk5 = (bpwk) da2.mo74062i();
                bpwk5.getClass();
                if (!bpwl2.f139525c.mo73666a()) {
                    bpwl2.f139525c = GeneratedMessageLite.m124021a(bpwl2.f139525c);
                }
                bpwl2.f139525c.add(bpwk5);
            }
        }
        return da;
    }
}
