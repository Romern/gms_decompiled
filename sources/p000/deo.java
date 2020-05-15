package p000;

import android.content.Context;
import com.google.android.chimera.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: deo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface deo {
    Loader getModuleLoader();

    void superAbandon();

    boolean superCancelLoad();

    void superCommitContentChanged();

    String superDataToString(Object obj);

    void superDeliverCancellation();

    void superDeliverResult(Object obj);

    void superDump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    void superForceLoad();

    Context superGetContext();

    int superGetId();

    boolean superIsAbandoned();

    boolean superIsReset();

    boolean superIsStarted();

    void superOnAbandon();

    boolean superOnCancelLoad();

    void superOnContentChanged();

    void superOnForceLoad();

    void superOnReset();

    void superOnStartLoading();

    void superOnStopLoading();

    void superRegisterListener(int i, C1139kn knVar);

    void superRegisterOnLoadCanceledListener(C1138km kmVar);

    void superReset();

    void superRollbackContentChanged();

    void superStopLoading();

    boolean superTakeContentChanged();

    String superToString();

    void superUnregisterListener(C1139kn knVar);

    void superUnregisterOnLoadCanceledListener(C1138km kmVar);
}
