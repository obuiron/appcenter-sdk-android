package avalanche.errors;

import avalanche.errors.model.ErrorAttachment;
import avalanche.errors.model.ErrorReport;

/**
 * Abstract class with default behaviors for error reporting listener.
 */
public abstract class AbstractErrorReportingListener implements ErrorReportingListener {
    @Override
    public boolean shouldProcess(ErrorReport errorReport) {
        return true;
    }

    @Override
    public boolean shouldAwaitUserConfirmation() {
        return false;
    }

    @Override
    public ErrorAttachment getErrorAttachment(ErrorReport errorReport) {
        return null;
    }

    @SuppressWarnings("EmptyMethod")
    @Override
    public void onBeforeSending(ErrorReport errorReport) {
    }

    @SuppressWarnings("EmptyMethod")
    @Override
    public void onSendingFailed(ErrorReport errorReport, Exception e) {
    }

    @SuppressWarnings("EmptyMethod")
    @Override
    public void onSendingSucceeded(ErrorReport errorReport) {
    }
}
